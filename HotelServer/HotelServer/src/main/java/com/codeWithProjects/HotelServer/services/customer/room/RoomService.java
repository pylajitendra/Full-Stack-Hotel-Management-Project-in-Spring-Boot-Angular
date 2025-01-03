package com.codeWithProjects.HotelServer.services.customer.room;

import com.codeWithProjects.HotelServer.dto.RoomsResponseDto;

public interface RoomService {

    RoomsResponseDto getAvailableRooms(int pageNumber);
}
