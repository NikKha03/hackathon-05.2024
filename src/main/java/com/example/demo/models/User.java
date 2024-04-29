package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String name;
    private String surname;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String tg;

    private LocalDate dateOfBirth;

    private String password;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    private List<Role> roles;
}