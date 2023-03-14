package com.example.ManagementSystem.Model.DAO;

import lombok.Data;

@Data
public class LoginRequest {

    private String loginId;

    private String username;

    private String password;
}
