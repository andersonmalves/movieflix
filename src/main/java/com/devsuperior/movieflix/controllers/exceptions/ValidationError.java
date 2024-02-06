package com.devsuperior.movieflix.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ValidationError {
  private List<FieldMessage> errors = new ArrayList<>();
}
