package com.example.springmysqlelastic.rest;

import com.example.springmysqlelastic.model.dto.UserDTO;
import com.example.springmysqlelastic.service.IUserService;
import com.example.springmysqlelastic.utils.PathResources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(PathResources.USER)
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(PathResources.SAVE)
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(this.userService.save(userDTO), HttpStatus.OK);
    }

    @GetMapping(PathResources.FIND_ONE + "/{" + PathResources.ID + "}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.userService.findById(id), HttpStatus.OK);
    }

    @GetMapping(PathResources.FIND_ALL)
    public ResponseEntity<List<UserDTO>> findById() {
        return new ResponseEntity<>(this.userService.findAll(), HttpStatus.OK);
    }
}
