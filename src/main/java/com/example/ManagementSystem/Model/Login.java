package com.example.ManagementSystem.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@Data
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String loginId;

    private String username;

    private String password;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "login")
    @JsonBackReference
    private Users users;
}
