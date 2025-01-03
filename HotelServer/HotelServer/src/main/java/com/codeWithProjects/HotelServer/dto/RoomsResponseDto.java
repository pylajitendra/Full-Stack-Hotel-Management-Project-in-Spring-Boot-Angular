package com.codeWithProjects.HotelServer.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoomsResponseDto {

    private List<RoomDto> roomDtoList;

    private Integer totalPages;

    private Integer pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    // Getter and Setter for totalPages
    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    // Getter and Setter for roomDtoList
    public List<RoomDto> getRoomDtoList() {
        return roomDtoList;
    }

    public void setRoomDtoList(List<RoomDto> roomDtoList) {
        this.roomDtoList = roomDtoList;
    }
}
