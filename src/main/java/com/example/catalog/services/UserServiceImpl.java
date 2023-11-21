package com.example.catalog.services;

import com.example.catalog.entities.User;
import com.example.catalog.exception.MusicNotFoundException;
import com.example.catalog.exception.UserNotFoundException;
import com.example.catalog.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(()->{
            throw new UserNotFoundException("User mevcut değil");
        });
    }
    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }
    @Override
    public User updateUser(Long id, User user){
        User updatedUser=userRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Series mevcut değil"));

        updatedUser.setUsername(user.getUsername());
        updatedUser.setPassword(user.getPassword());

        return userRepository.save(updatedUser);
    }
    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
