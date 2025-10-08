package com.pankaj.crud_api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pankaj.crud_api.Repository.TodoRepository;
import com.pankaj.crud_api.Repository.UserRepository;
import com.pankaj.crud_api.dto.TodoDto;
import com.pankaj.crud_api.models.Todo;
import com.pankaj.crud_api.models.User;

@Service
public class TodoServices {

    private final TodoRepository todoRepository;
    private final UserRepository userRepository;

    public TodoServices(TodoRepository todoRepository, UserRepository userRepository) {
        this.todoRepository = todoRepository;
        this.userRepository = userRepository;
    }

    public Todo create(TodoDto todoDto) {
        Todo todo = new Todo();
        User usr = userRepository.findById(todoDto.userId())
                .orElseThrow(() -> new RuntimeException("User Not Exists"));
        todo.setTask(todoDto.task());
        todo.setCreatedBy(usr);

        return todoRepository.save(todo);
    }

    public List<Todo> get_all(Long userId) {

        User usr = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User Not Exists"));
        return todoRepository.findByCreatedBy(usr);

    }

}
