package com.example.catalog.services;

import com.example.catalog.entities.Music;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MusicService {

    public Music getMusic(Long id);
    public List<Music> getAllMusic();
    public Music createMusic(Music music);

    public Music updateMusic(Long id, Music music);

    public void deleteMusic(Long id);

}
