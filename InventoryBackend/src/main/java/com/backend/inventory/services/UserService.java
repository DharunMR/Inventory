package com.backend.inventory.services;

import com.backend.inventory.dtos.LoginRequest;
import com.backend.inventory.dtos.RegisterRequest;
import com.backend.inventory.dtos.Response;
import com.backend.inventory.dtos.UserDTO;
import com.backend.inventory.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}