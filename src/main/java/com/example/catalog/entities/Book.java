package com.example.catalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "writer")
    private String writer;

    @Column(name = "isbn")
    private Long isbn;
}
