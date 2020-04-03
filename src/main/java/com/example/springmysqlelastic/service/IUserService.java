package com.example.springmysqlelastic.service;

import com.example.springmysqlelastic.model.dto.UserDTO;

import java.util.List;

public interface IUserService {
    UserDTO save(UserDTO userDTO);
    UserDTO findById(Long id);
    List<UserDTO> findAll();
}
