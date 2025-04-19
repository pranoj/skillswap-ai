package com.skillswap.backend;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class User {
    private String name;
    private String email;
    private String skillOffered;
    private  String skillWanted;

}
