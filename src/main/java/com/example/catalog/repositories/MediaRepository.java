package com.example.catalog.repositories;

import com.example.catalog.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media,Long> {
}
