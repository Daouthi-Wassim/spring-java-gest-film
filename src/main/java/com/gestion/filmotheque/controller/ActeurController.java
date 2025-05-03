// ActeurController.java
package com.gestion.filmotheque.controller;

import com.gestion.filmotheque.entities.Acteur;
import com.gestion.filmotheque.service.IServiceActeur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/acteur/")
@AllArgsConstructor
public class ActeurController {
    private final IServiceActeur iServiceActeur;

    @GetMapping("all")
    public String allActeurs(Model model) {
        model.addAttribute("acteurs", iServiceActeur.findAllActeurs());
        return "afficheActeurs";
    }

    @GetMapping("new")
    public String afficheNewActeur() {
        return "ajoutActeur";
    }

    @PostMapping("add")
    public String addActeur(Acteur acteur) {
        iServiceActeur.createActeur(acteur);
        return "redirect:/acteur/all";
    }

}