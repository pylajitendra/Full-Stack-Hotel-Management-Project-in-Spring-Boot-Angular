package com.codeWithProjects.HotelServer.dto;

import lombok.Data;

@Data
public class RoomDto {

    private Long id;

    private String name;

    private String type;

    private Long price;

    private boolean available;

    public String getName() {
        return name;
    }

    // Getter for price
    public Long getPrice() {
        return price;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setters (if required)
    public void setName(String name) {
        this.name = name;
    }

    public Long setPrice(Long price) {
        this.price = price;
        return this.price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
