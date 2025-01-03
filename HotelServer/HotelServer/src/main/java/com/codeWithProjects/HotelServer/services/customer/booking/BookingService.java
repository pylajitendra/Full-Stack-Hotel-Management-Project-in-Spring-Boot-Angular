package com.codeWithProjects.HotelServer.services.customer.booking;

import com.codeWithProjects.HotelServer.dto.ReservationDto;
import com.codeWithProjects.HotelServer.dto.ReservationResponseDto;

public interface BookingService {

    boolean postReservation(ReservationDto reservationDto);

    ReservationResponseDto getAllReservationByUserId(Long userId, int pageNumber);

}
