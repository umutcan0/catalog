package com.example.catalog.controller;

import com.example.catalog.entities.Media;
import com.example.catalog.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    @GetMapping("/{id}")
    public Media getMedia(@PathVariable Long id){
        return mediaService.getMedia(id);
    }

    @GetMapping("/getAll")
    public List<Media> getAllMedia(){
        return mediaService.getAllMedia();
    }

    @PostMapping("/create")
    public Media createMedia(@RequestBody Media media){
        return mediaService.createMedia(media);
    }

    @PutMapping("/update/{id}")
    public Media updateMedia(@PathVariable Long id,@RequestBody Media media){
        return mediaService.updateMedia(id,media);
    }

    @DeleteMapping("/{id}")
    public void deleteMedia(@PathVariable Long id){
        mediaService.deleteMedia(id);
    }
}
