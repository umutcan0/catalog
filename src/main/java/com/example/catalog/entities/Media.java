package com.example.catalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "count")
    private Long count;

    @Column(name = "description")
    private String description;

    @Column(name = "rating")
    private Integer rating;

    @Column(name= "media_type")
    private Long mediaType;

    @Column(name= "media_id")
    private Long mediaId;
}
