package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.entities.Categorie;
import com.gestion.filmotheque.service.IServiceCategorie;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class RestCategorieController {

    private final IServiceCategorie iServiceCategorie;

    @GetMapping("")
    public ResponseEntity<List<Categorie>> getAllCategories() {
        return ResponseEntity.ok(iServiceCategorie.findAllCategories());
    }

    @PostMapping("")
    @Operation(summary = "Ajouter une nouvelle catégorie")
    @ApiResponse(responseCode = "201", description = "Catégorie créée")
    public ResponseEntity<Categorie> addCategorie(@RequestBody Categorie categorie) {
        return new ResponseEntity<>(iServiceCategorie.createCategorie(categorie), HttpStatus.CREATED);
    }

    public IServiceCategorie getiServiceCategorie() {
        return iServiceCategorie;
    }
}