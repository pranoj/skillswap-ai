package com.skillswap.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUserProfile(){
        return new User(
                "Anya",
                "anya@example.com",
                "Guitar",
                "Spanish"
        );
    }

}
