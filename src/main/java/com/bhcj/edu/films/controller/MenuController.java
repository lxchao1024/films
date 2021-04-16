package com.bhcj.edu.films.controller;

import com.bhcj.edu.films.result.Result;
import com.bhcj.edu.films.result.ResultFactory;
import com.bhcj.edu.films.service.AdminMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuController {
    @Autowired
    AdminMenuService adminMenuService;

    @GetMapping("/api/menu")
    public Result menu() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByCurrentUser());
    }

    @GetMapping("/api/admin/role/menu")
    public Result listAllMenus() {
        return ResultFactory.buildSuccessResult(adminMenuService.getMenusByRoleId(1));
    }
}