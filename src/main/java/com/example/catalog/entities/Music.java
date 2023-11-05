package com.example.catalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "singer", unique = true)
    private String singer;

    @Column(name = "album")
    private String album;
}
