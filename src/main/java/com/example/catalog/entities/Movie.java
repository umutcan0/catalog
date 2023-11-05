package com.example.catalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "actor", unique = true)
    private String actor;

    @Column(name = "releaseDate")
    private Integer releaseDate;

}
