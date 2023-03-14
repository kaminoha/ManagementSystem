package com.example.ManagementSystem.Controller;


import com.example.ManagementSystem.Model.DAO.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/register")
    public String register(){
        return "Hello World";
    }

    @PostMapping("login")
    public String login(LoginRequest loginRequest) {
        return "";
    }
}
