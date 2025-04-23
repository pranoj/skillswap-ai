package com.skillswap.backend;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("Anya", "anya@example.com", "Guitar", "Spanish"));
        users.add(new User("Leo", "leo@skillswap.com", "Cooking", "French"));
    }

    public List<User> getAllUsers(){
        return users;
    }

    public User getUserByName(String name){
        return getAllUsers().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("Saving user: " + user.getName());
    }

}
