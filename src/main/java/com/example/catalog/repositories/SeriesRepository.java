package com.example.catalog.repositories;

import com.example.catalog.entities.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series,Long> {
}
