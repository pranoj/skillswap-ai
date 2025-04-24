package com.skillswap.backend;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String name){
        super("User with name '" + name +"' not found");
    }
}
