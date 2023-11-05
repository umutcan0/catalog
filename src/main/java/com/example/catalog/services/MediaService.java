package com.example.catalog.services;

import com.example.catalog.entities.Media;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MediaService {
    public List<Media> getAllMedia();
    public Media getMedia(Long id);
    public Media createMedia(Media media);
    public Media updateMedia(Long id, Media media);
    public void deleteMedia(Long id);
}
