package com.gestion.filmotheque.service;
import com.gestion.filmotheque.entities.Film;
import jdk.jfr.Category;

import java.util.List;

public interface IServiceFilm {
    public Film createFilm(Film film);
    public Film findFilmById(int id);
    public List<Film> findAllFilms();
    public Film updateFilm(Film film);
    public void deleteFilm(int id);
    public List<Film> searchByTitre(String keyword);
    List<Film> findByCategory(Integer categoryId);

    public Boolean filmExist(int id);

}
