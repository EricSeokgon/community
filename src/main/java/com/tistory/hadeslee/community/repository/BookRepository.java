package com.tistory.hadeslee.community.repository;

import com.tistory.hadeslee.community.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAll();

    Book getOne(Integer idx);

    void deleteAll();
}
