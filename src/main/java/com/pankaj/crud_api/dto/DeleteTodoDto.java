package com.pankaj.crud_api.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public record DeleteTodoDto(
        @NotBlank(message = "TaskId cannot be empty") UUID taskId) {

}
