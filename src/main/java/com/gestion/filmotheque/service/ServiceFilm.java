package com.gestion.filmotheque.service;

import com.gestion.filmotheque.entities.Film;
import com.gestion.filmotheque.repository.CategorieRepository;
import com.gestion.filmotheque.repository.FilmRepository;
import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceFilm implements IServiceFilm{

    FilmRepository filmRepository;
    @Override
    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film findFilmById(int id) {
        return filmRepository.findById(id).get();
    }



    @Override
    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilm(int id) {
        filmRepository.deleteById(id);
    }
    @Override
    public List<Film> searchByTitre(String keyword) {
        return filmRepository.findByTitreContainingIgnoreCase(keyword);
    }
    @Override
    public List<Film> findAllFilms() {
        return filmRepository.findAllByOrderByTitreAsc();
    }
    @Override
    public List<Film> findByCategory(Integer categoryId) {
        if (categoryId == 0) return findAllFilms();
        return filmRepository.findByCategorieId(categoryId);
    }

    @Override
    public Boolean filmExist(int id) {
        return filmRepository.existsById(id);
    }

}
