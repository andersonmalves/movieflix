package com.devsuperior.movieflix.controllers.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class OAuthCustomError {
  private String error;

  @JsonProperty("error_description")
  private String errorDescription;
}
