package com.pankaj.crud_api.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.crud_api.Services.TodoServices;
import com.pankaj.crud_api.dto.TodoDto;
import com.pankaj.crud_api.dto.TodoResponseDto;
import com.pankaj.crud_api.dto.UserDto;
import com.pankaj.crud_api.models.Todo;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/web/api/todo")
public class TodoController {

    private final TodoServices todoServices;

    public TodoController(TodoServices todoServices) {
        this.todoServices = todoServices;
    }

    @PostMapping("/create")
    public ResponseEntity<TodoResponseDto> CreateTodo(@Valid @RequestBody TodoDto todoDto) {
        Todo todo = todoServices.create(todoDto);
        UserDto usr = new UserDto(
                todo.getCreatedBy().getEmail(),
                todo.getCreatedBy().getFullName(),
                todo.getCreatedBy().getRole());
        TodoResponseDto dt = new TodoResponseDto(todo.getTask(), todo.getStatus(), todo.getCreatedAt(), usr);
        return ResponseEntity.ok(dt);

    }

}
