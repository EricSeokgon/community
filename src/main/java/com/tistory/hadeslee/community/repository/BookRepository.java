package com.tistory.hadeslee.community.repository;

import com.tistory.hadeslee.community.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
