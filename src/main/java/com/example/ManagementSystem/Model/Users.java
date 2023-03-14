package com.example.ManagementSystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@Data
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String userId;

    private String firstName;

    private String lastName;

    private int age;

    private String address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "users")
    @JoinColumn(name = "loginId", referencedColumnName = "userId")
    private Login login;

}
