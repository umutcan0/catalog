package com.example.catalog.controller;

import com.example.catalog.entities.Music;
import com.example.catalog.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Music>> getAllMusic(){
        List<Music> musics=musicService.getAllMusic();
        return ResponseEntity.ok(musics);
    }

    @GetMapping("/{id}")
    public Music getMusic(@PathVariable Long id){
        return musicService.getMusic(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Music> createMusic(@RequestBody Music music){
        Music createdMusic=musicService.createMusic(music);
        return ResponseEntity.ok(createdMusic);
    }

    @PutMapping("/update/{id}")
    public Music updateMusic(@PathVariable Long id, @RequestBody Music music){
        Music updatedMusic=musicService.updateMusic(id,music);
        return updatedMusic;
    }

    @DeleteMapping("/{id}")
    public void deleteMusic(@PathVariable Long id){
        musicService.deleteMusic(id);
    }

}
