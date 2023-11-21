package com.example.catalog.services;

import com.example.catalog.entities.Music;
import com.example.catalog.exception.MediaNotFoundException;
import com.example.catalog.exception.MusicNotFoundException;
import com.example.catalog.repositories.MusicRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{

    @Autowired
    private MusicRepository musicRepository;

    @Override
    public Music getMusic(Long id){
        Music music=musicRepository.findByIdWithMedia(id).orElseThrow(()-> {
            throw new MusicNotFoundException("Music mevcut değil");
        });
        return music;
    }
    @Override
    public List<Music> getAllMusic(){
        return musicRepository.findAll();
    }

    @Override
    public Music createMusic(Music music){
        return musicRepository.save(music);
    }

    @Override
    public Music updateMusic(Long id, Music music){
        Music updatedMusic = musicRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Music mevcut değil"));

        updatedMusic.setName(music.getName());
        updatedMusic.setSinger(music.getSinger());

        return musicRepository.save(updatedMusic);
    }

    @Override
    public void deleteMusic(Long id){
        musicRepository.deleteById(id);
    }
}
