package com.example.catalog.services;

import com.example.catalog.entities.Media;
import com.example.catalog.repositories.MediaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MediaServiceImpl implements MediaService{

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public List<Media> getAllMedia(){
        return mediaRepository.findAll();
    }

    @Override
    public Media getMedia(Long id){
        return mediaRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Media mevcut değil"));
    }

    @Override
    public Media createMedia(Media media){
        return mediaRepository.save(media);
    }

    @Override
    public Media updateMedia(Long id, Media media){
        Media updatedMedia=mediaRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Media mevcut değil"));

        updatedMedia.setDescription(media.getDescription());
        updatedMedia.setCount(media.getCount());

        return mediaRepository.save(updatedMedia);
    }

    @Override
    public void deleteMedia(Long id){
        mediaRepository.deleteById(id);
    }
}
