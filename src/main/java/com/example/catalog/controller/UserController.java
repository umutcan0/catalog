package com.example.catalog.controller;

import com.example.catalog.entities.Music;
import com.example.catalog.entities.User;
import com.example.catalog.services.MusicService;
import com.example.catalog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user=userService.getAllUser();
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping("/create")
    public ResponseEntity<User> createMusic(@RequestBody User user){
        User createdUser=userService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user){
        User updatedUser=userService.updateUser(id,user);
        return updatedUser;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
