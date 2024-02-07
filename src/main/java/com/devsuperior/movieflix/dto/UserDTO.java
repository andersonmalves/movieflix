package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDTO {
  private Long id;
  private String name;
  private String email;
}
