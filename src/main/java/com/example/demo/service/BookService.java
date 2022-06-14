package com.example.demo.service;

import java.util.List;

import com.example.demo.model.BookEntity;
import com.example.demo.repository.BookMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookMapper bookDao;

    // 1件検索
    public BookEntity findById(Integer id) {
        BookEntity book = new BookEntity();
        book.setId(id);
        return this.bookDao.findById(book);
    }

    // 全件取得
    public List<BookEntity> getBookList() {
        return this.bookDao.findAll();
    }
}