package com.example.catalog.repositories;

import com.example.catalog.entities.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MediaRepository extends JpaRepository<Media,Long> {

    @Query("SELECT m FROM Media m WHERE m.mediaType = ?1 and m.mediaId = ?2")//soru işareti metoddaki variablelar için kullanılır. Burada 1 ve 2 variable sırasıdır.
    Media findByMediaTypeAndMediaId(Long mediaType, Long mediaId);


}
