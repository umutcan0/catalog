package com.example.catalog.controller;

import com.example.catalog.entities.Series;
import com.example.catalog.repositories.SeriesRepository;
import com.example.catalog.services.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    private SeriesService seriesService;

    @GetMapping("/getAll")
    public List<Series> getAllSeries(){
        return seriesService.getAllSeries();
    }

    @GetMapping("/{id}")
    public Series getSeries(@PathVariable Long id){
        return seriesService.getSeries(id);
    }

    @PostMapping("/create")
    public Series createSeries(@RequestBody Series series){
        return seriesService.createSeries(series);
    }

    @PutMapping("/update/{id}")
    public Series updateSeries(@PathVariable Long id, @RequestBody Series series){
        return seriesService.updateSeries(id,series);
    }

    @DeleteMapping("/{id}")
    public void deleteSeries(@PathVariable Long id){
        seriesService.deleteSeries(id);
    }
}
