package com.devsuperior.movieflix.dto;

import lombok.Builder;

@Builder
public class UserDTO {
  private Long id;
  private String name;
  private String email;
}
