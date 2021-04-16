package com.bhcj.edu.films.controller;

import com.bhcj.edu.films.result.Result;
import com.bhcj.edu.films.result.ResultFactory;
import com.bhcj.edu.films.service.FilmCartService;
import com.bhcj.edu.films.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmCartController {
    @Autowired
    UserService userService;
    @Autowired
    FilmCartService filmCartService;

    @GetMapping("/api/cart/{uid}/list")
    public Result listFilmCommons(@PathVariable("uid") int uid) {
        return ResultFactory.buildSuccessResult(filmCartService.findAllByFilmId(uid));
    }
}
