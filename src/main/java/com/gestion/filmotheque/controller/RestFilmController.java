package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.entities.Film;
import com.gestion.filmotheque.service.IServiceFilm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
@AllArgsConstructor
public class RestFilmController {

    private final IServiceFilm iServiceFilm;

    @GetMapping("")
    @Operation(summary = "Récupérer tous les films")
    public ResponseEntity<List<Film>> getAllFilms() {
        return ResponseEntity.ok(iServiceFilm.findAllFilms());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Récupérer un film par son ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Film trouvé"),
            @ApiResponse(responseCode = "404", description = "Film non trouvé")
    })
    public ResponseEntity<?> getFilmById(@PathVariable int id) {
        if (!iServiceFilm.filmExist(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Film non trouvé");
        }
        return ResponseEntity.ok(iServiceFilm.findFilmById(id));
    }

    @PostMapping("")
    @Operation(summary = "Ajouter un nouveau film")
    @ApiResponse(responseCode = "201", description = "Film créé")
    public ResponseEntity<Film> addFilm(@RequestBody Film film) {
        Film createdFilm = iServiceFilm.createFilm(film);
        return new ResponseEntity<>(createdFilm, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Mettre à jour un film")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Film mis à jour"),
            @ApiResponse(responseCode = "404", description = "Film non trouvé")
    })
    public ResponseEntity<?> updateFilm(@PathVariable int id, @RequestBody Film film) {
        if (!iServiceFilm.filmExist(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Film non trouvé");
        }
        film.setId(id);
        return ResponseEntity.ok(iServiceFilm.updateFilm(film));
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un film")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Film supprimé"),
            @ApiResponse(responseCode = "404", description = "Film non trouvé")
    })
    public ResponseEntity<?> deleteFilm(@PathVariable int id) {
        if (!iServiceFilm.filmExist(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Film non trouvé");
        }
        iServiceFilm.deleteFilm(id);
        return ResponseEntity.ok("Film supprimé");
    }

    @GetMapping("/search")
    @Operation(summary = "Rechercher des films par titre")
    public ResponseEntity<List<Film>> searchByTitle(@RequestParam String keyword) {
        return ResponseEntity.ok(iServiceFilm.searchByTitre(keyword));
    }

    @GetMapping("/filter")
    @Operation(summary = "Filtrer les films par catégorie")
    public ResponseEntity<List<Film>> filterByCategory(@RequestParam(required = false, defaultValue = "0") Integer idcat) {
        return ResponseEntity.ok(iServiceFilm.findByCategory(idcat));
    }
}