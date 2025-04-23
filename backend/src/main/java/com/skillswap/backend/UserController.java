package com.skillswap.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUserProfile(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{name}")
    public User getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }
}
