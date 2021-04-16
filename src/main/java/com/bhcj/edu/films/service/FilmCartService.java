package com.bhcj.edu.films.service;


import com.bhcj.edu.films.dao.FilmCartDAO;
import com.bhcj.edu.films.entity.FilmCarts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmCartService {

    @Autowired
    private FilmCartDAO filmCartDAO;

    public List<FilmCarts> findAllByFilmId(int uid){
        List<FilmCarts> result = filmCartDAO.findAllByUid(uid);
        return result;
    }
}
