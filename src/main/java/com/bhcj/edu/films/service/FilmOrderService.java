package com.bhcj.edu.films.service;


import com.bhcj.edu.films.dao.FilmOrdersDAO;
import com.bhcj.edu.films.entity.FilmOrders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmOrderService {

    @Autowired
    private FilmOrdersDAO filmOrdersDAO;

    public List<FilmOrders> findAllByFilmId(int uid){
        List<FilmOrders> result = filmOrdersDAO.findAllByUid(uid);
        return result;
    }
}
