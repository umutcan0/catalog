package com.example.catalog.services;

import com.example.catalog.entities.Series;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SeriesService {

    public Series getSeries(Long id);
    public List<Series> getAllSeries();
    public Series createSeries(Series series);
    public Series updateSeries(Long id, Series series);
    public void deleteSeries(Long id);
}
