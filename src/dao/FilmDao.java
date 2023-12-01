package dao;

import dao.entities.Film;

import java.util.List;


public interface FilmDao {
    List<Film> getAllFilms();
    Film getFilmById(int id);

    List<Film> getFromTo(int start ,int end);
}
