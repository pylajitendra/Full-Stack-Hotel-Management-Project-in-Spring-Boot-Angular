package com.codeWithProjects.HotelServer.services.admin.reservation;

import com.codeWithProjects.HotelServer.dto.ReservationResponseDto;

public interface ReservationService {

    ReservationResponseDto getAllReservations(int pageNumber);

    boolean changeReservationStatus(Long id, String status);

}
