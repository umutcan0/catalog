package com.example.catalog.repositories;

import com.example.catalog.entities.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music,Long> {

    @Query ("select m, md from Music m left join m.media md on md.mediaType=1 where m.id=?1")
    Optional<Music> findByIdWithMedia(Long id);
}
