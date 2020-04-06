package com.example.springmysqlelastic.mapper;

import com.example.springmysqlelastic.model.User;
import com.example.springmysqlelastic.model.UserModel;
import com.example.springmysqlelastic.model.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toUserDTO(User user);

    List<UserDTO> toUserDtos(List<User> users);

    User toUser(UserDTO userDTO);

    List<User> toUsers(List<UserDTO> userDTOS);

    UserModel toUserModel(User user);
}
