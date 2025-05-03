package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.entities.Acteur;
import com.gestion.filmotheque.entities.Film;
import com.gestion.filmotheque.service.IServiceActeur;
import com.gestion.filmotheque.service.IServiceCategorie;
import com.gestion.filmotheque.service.IServiceFilm;

import com.gestion.filmotheque.service.ServiceActeur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/film/")
@AllArgsConstructor
public class FilmController {

    private final ServiceActeur serviceActeur;
    IServiceFilm  iServiceFilm;
    IServiceCategorie iServiceCategorie;

    @GetMapping("all")
    public String allFilms(Model model){
        model.addAttribute("films", iServiceFilm.findAllFilms());
        model.addAttribute("categories", iServiceCategorie.findAllCategories());
        return "affiche";
    }

    @GetMapping("new")
    public String affichenewFilm(Model model){
        model.addAttribute("categories", iServiceCategorie.findAllCategories());
        model.addAttribute("acteurs", serviceActeur.findAllActeurs());
        return "ajout";
    }
    @PostMapping("add")
    public String add(Film f){
        iServiceFilm.createFilm(f);
        return "redirect:/film/all";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id){
        iServiceFilm.deleteFilm(id);
        return "redirect:/film/all";
    }

    @GetMapping("edit/{id}")
    public String editFilm(@PathVariable int id, Model model) {
        Film film = iServiceFilm.findFilmById(id);
        model.addAttribute("film", film);
        model.addAttribute("categories", iServiceCategorie.findAllCategories());
        model.addAttribute("acteurs", serviceActeur.findAllActeurs());
        return "edit";
    }

    @PostMapping("update")
    public String updateFilm(Film film) {
        iServiceFilm.updateFilm(film);
        return "redirect:/film/all"; 
    }


    @GetMapping("search")
    public String searchFilms(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("films", iServiceFilm.searchByTitre(keyword));
        return "affiche";
    }
    @GetMapping("asclist")
    public String all(Model model) {
        model.addAttribute("films", iServiceFilm.findAllFilms());
        return "affiche";
    }
    @GetMapping("affiche")
    public String all(
            @RequestParam(required = false, defaultValue = "0") Integer idcat,
            Model model
    ) {
        model.addAttribute("films", iServiceFilm.findByCategory(idcat));
        model.addAttribute("categories", iServiceCategorie.findAllCategories());
        model.addAttribute("selectedCategoryId", idcat);
        model.addAttribute("acteurs", serviceActeur.findAllActeurs());


        return "affiche";
    }

}
