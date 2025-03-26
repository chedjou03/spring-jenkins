package com.spring_Jenkins.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

@Data  // Generates Getters, Setters, toString, equals, and hashCode
@JsonSerialize
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private long creditLimit;
    private long creditUsage;


    // No-arg constructor
    public Client() {}

    // All-args constructor
    public Client(int id, String firstName, String lastName, String email, long creditLimit, long creditUsage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditLimit = creditLimit;
        this.creditUsage = creditUsage;

    }
}
