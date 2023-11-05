package com.example.catalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "series")
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type", unique = true)
    private String type;

    @Column(name = "year")
    private Integer year;
}
