package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.AdminPermission;
import com.bhcj.edu.films.entity.JotterArticle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}
