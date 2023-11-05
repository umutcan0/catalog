package com.example.catalog.services;

import com.example.catalog.entities.Series;
import com.example.catalog.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public User getUser(Long id);
    public List<User> getAllUser();
    public User createUser(User user);
    public User updateUser(Long id, User user);
    public void deleteUser(Long id);
}
