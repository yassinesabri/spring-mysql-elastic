package com.example.springmysqlelastic.service.impl;

import com.example.springmysqlelastic.mapper.UserMapper;
import com.example.springmysqlelastic.model.User;
import com.example.springmysqlelastic.model.dto.UserDTO;
import com.example.springmysqlelastic.repo.IUserDAO;
import com.example.springmysqlelastic.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    private IUserDAO userDAO;
    private UserMapper userMapper;

    @Autowired
    public UserService(IUserDAO userDAO, UserMapper userMapper) {
        this.userDAO = userDAO;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = this.userDAO.save(this.userMapper.toUser(userDTO));
        return this.userMapper.toUserDTO(user);
    }

    @Override
    public UserDTO findById(Long id) {
        return this.userMapper.toUserDTO(this.userDAO.findById(id).orElse(null));
    }

    @Override
    public List<UserDTO> findAll() {
        return this.userMapper.toUserDtos(this.userDAO.findAll());
    }
}
