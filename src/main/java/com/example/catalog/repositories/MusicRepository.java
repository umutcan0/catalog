package com.example.catalog.repositories;

import com.example.catalog.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Long> {
}
