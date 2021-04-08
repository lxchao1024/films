package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.AdminUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminUserRoleDAO extends JpaRepository<AdminUserRole, Integer> {
    List<AdminUserRole> findAllByUid(int uid);
    void deleteAllByUid(int uid);
}