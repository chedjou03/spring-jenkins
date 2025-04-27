package com.spring_Jenkins.demo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.util.Objects;

//@Data  // Generates Getters, Setters, toString, equals, and hashCode
@JsonSerialize
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Long creditLimit;
    private Long creditUsage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public long getCreditUsage() {
        return creditUsage;
    }

    public void setCreditUsage(long creditUsage) {
        this.creditUsage = creditUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return getId() == client.getId() && getCreditLimit() == client.getCreditLimit() && getCreditUsage() == client.getCreditUsage() && Objects.equals(getFirstName(), client.getFirstName()) && Objects.equals(getLastName(), client.getLastName()) && Objects.equals(getEmail(), client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getEmail(), getCreditLimit(), getCreditUsage());
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                ", creditUsage=" + creditUsage +
                '}';
    }

    // No-arg constructor
    public Client() {}

    // All-args constructor
    public Client(int id, String firstName, String lastName, String email, Long creditLimit, Long creditUsage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditLimit = creditLimit;
        this.creditUsage = creditUsage;

    }
}
