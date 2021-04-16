package com.bhcj.edu.films.controller;

import com.bhcj.edu.films.result.Result;
import com.bhcj.edu.films.result.ResultFactory;
import com.bhcj.edu.films.service.FilmCommonsService;
import com.bhcj.edu.films.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmCommonsController {
    @Autowired
    UserService userService;
    @Autowired
    FilmCommonsService filmCommonsService;

    @GetMapping("/api/commons/{filmId}/films")
    public Result listFilmCommons(@PathVariable("filmId") int filmId) {
        return ResultFactory.buildSuccessResult(filmCommonsService.findAllByFilmId(filmId));
    }

    @GetMapping("/api/commons/{uid}/{filmId}")
    public Result listFilmCommons(@PathVariable("uid") int uid, @PathVariable("filmId") int filmId) {
        return ResultFactory.buildSuccessResult(filmCommonsService.findByMyself(uid, filmId));
    }
}
