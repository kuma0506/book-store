package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.BookEntity;

import org.apache.ibatis.annotations.Mapper;

//@MapperでRepositoryクラスになる
@Mapper
public interface BookMapper {
    // 1件検索
    BookEntity findById(BookEntity book);

    // 全件取得
    List<BookEntity> findAll();

    // 件数取得
    int countBookEntity();

    // 総額取得
    int totalPrice();
}