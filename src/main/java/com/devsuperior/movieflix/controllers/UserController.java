package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.dto.mapper.UserMapper;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.AuthService;
import com.devsuperior.movieflix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping(value = "/profile")
  public ResponseEntity<UserDTO> getProfile() {
    UserDTO userDTO = userService.getProfile();
    return ResponseEntity.ok().body(userDTO);
  }
}
