package com.codeWithProjects.HotelServer.dto;

import lombok.Data;

import java.util.List;

@Data
public class ReservationResponseDto {

    private Integer totalPages;

    private Integer pageNumber;

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<ReservationDto> getReservationDtoList() {
        return reservationDtoList;
    }

    public void setReservationDtoList(List<ReservationDto> reservationDtoList) {
        this.reservationDtoList = reservationDtoList;
    }

    private List<ReservationDto> reservationDtoList;

}
