package com.bhcj.edu.films.dao;

import com.bhcj.edu.films.entity.AdminMenu;
import com.bhcj.edu.films.entity.Book;
import com.bhcj.edu.films.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDAO extends JpaRepository<Book, Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
    Book findBookById(int id);
}
