package com.pankaj.crud_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TodoDto(
        @NotBlank(message = "Task cannot be empty") @Size(max = 255, message = "Task cannot exceed 255 characters")

        String task,
        Long userId) {

}
