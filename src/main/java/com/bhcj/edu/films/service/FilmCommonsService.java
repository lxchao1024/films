package com.bhcj.edu.films.service;


import com.bhcj.edu.films.dao.FilmCommonsDAO;
import com.bhcj.edu.films.entity.FilmCommons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmCommonsService {

    @Autowired
    private FilmCommonsDAO filmCommonsDAO;


    public List<FilmCommons> findAllByFilmId(int filmId){
        List<FilmCommons> result = filmCommonsDAO.findAllByFilmid(filmId);
        return result;
    }

    public FilmCommons findByMyself(int uid, int filmId){
        FilmCommons filmCommons = filmCommonsDAO.findByUidAndFilmid(uid, filmId);
        return filmCommons;
    }
}
