package com.devsuperior.movieflix.controllers;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.services.AuthService;
import com.devsuperior.movieflix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/users")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private AuthService authService;

  @GetMapping(value = "/profile")
  public ResponseEntity<UserDTO> getProfile() {
    var user = authService.authenticated();
    log.info("User: {}", user.getName());
    UserDTO userDTO = UserDTO.builder().id(user.getId()).name(user.getName()).email(user.getEmail()).build();
    return ResponseEntity.ok().body(userDTO);
  }

  @GetMapping("/test")
  public User getUser() {
    return authService.authenticated();
  }

}
