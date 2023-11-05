package com.example.catalog.services;

import com.example.catalog.entities.Series;
import com.example.catalog.repositories.SeriesRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesServiceImpl implements SeriesService{

    @Autowired
    private SeriesRepository seriesRepository;

    @Override
    public Series getSeries(Long id){
        return seriesRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Series mevcut değil"));
    }
    @Override
    public List<Series> getAllSeries(){
        return seriesRepository.findAll();
    }
    @Override
    public Series createSeries(Series series){
        return seriesRepository.save(series);
    }
    @Override
    public Series updateSeries(Long id, Series series){
        Series updatedSeries=seriesRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Series mevcut değil"));

        updatedSeries.setName(series.getName());
        updatedSeries.setType(series.getType());

        return seriesRepository.save(updatedSeries);
    }
    @Override
    public void deleteSeries(Long id){
        seriesRepository.deleteById(id);
    }
}
