package com.pankaj.crud_api.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.crud_api.models.Todo;
import com.pankaj.crud_api.models.User;

public interface TodoRepository extends JpaRepository<Todo, UUID> {

    List<Todo> findByCreatedBy(User usr);

}
