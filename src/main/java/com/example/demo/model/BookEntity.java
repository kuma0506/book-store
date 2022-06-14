package com.example.demo.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class BookEntity {
    private Integer id;
    private String bookName;
    private Integer volumeNum;
    private Integer price;
    private String authorName;
    private LocalDate publishedDate;
}