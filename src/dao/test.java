package dao;

import dao.entities.Film;

import java.util.List;

public class test {
    public static void main(String[] args) {
        FilmDao filmDao = new FilmDaoImp();
        List<Film> list = filmDao.getAllFilms();
        for (Film f : list) {
            System.out.println(f.toString());
        }
    }
}
