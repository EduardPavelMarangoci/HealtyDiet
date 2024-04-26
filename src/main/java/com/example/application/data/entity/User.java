package com.example.application.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends AbstractEntity {

    @NotEmpty
    private String name = "";

    @NotEmpty
    private String surname = "";

    @NotEmpty
    @Id
    private String username = "";

    @Email
    @NotEmpty
    private String email = "";

    @NotEmpty
    private String gender = "";

    @Override
    public String toString() { return name + " " + surname; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getUsername () { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

}

