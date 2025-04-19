package com.skillswap.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers(){
        return List.of(
                new User("Anya", "anya@example.com", "Guitar", "Spanish"),
                new User("Leo", "leo@skillswap.com", "Cooking", "French"),
                new User("Maya", "maya@swap.io", "Spanish", "Java Programming")
        );
    }

    public User getUserByName(String name){
        return getAllUsers().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }


}
