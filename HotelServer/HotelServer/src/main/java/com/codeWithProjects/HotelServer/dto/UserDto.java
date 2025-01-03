package com.codeWithProjects.HotelServer.dto;

import com.codeWithProjects.HotelServer.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String email;

    private String name;

    private UserRole userRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for userRole
    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = UserRole.valueOf(userRole.toUpperCase());
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
