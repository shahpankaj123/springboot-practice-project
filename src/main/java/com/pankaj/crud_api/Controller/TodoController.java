package com.pankaj.crud_api.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.crud_api.Services.TodoServices;
import com.pankaj.crud_api.dto.TodoDto;
import com.pankaj.crud_api.models.Todo;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/web/api/todo")
public class TodoController {

    private final TodoServices todoServices;

    public TodoController(TodoServices todoServices) {
        this.todoServices = todoServices;
    }

    @PostMapping("/create")
    public ResponseEntity<Todo> CreateTodo(@RequestBody TodoDto todoDto) {
        Todo todo = todoServices.create(todoDto);
        return ResponseEntity.ok(todo);

    }

}
