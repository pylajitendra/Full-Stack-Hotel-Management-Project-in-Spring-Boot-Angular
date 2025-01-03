package com.codeWithProjects.HotelServer.services.auth;

import com.codeWithProjects.HotelServer.dto.SignupRequest;
import com.codeWithProjects.HotelServer.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
}
