package com.gestion.filmotheque.service;

import com.gestion.filmotheque.entities.Categorie;
import jdk.jfr.Category;

import java.util.List;

public interface IServiceCategorie {
    public Categorie createCategorie(Categorie categorie);
    public List<Categorie> findAllCategories();
    public Categorie updateCategorie(Categorie categorie);
    public Categorie findCategorieById(int id);

}
