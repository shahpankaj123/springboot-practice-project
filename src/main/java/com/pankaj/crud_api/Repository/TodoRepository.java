package com.pankaj.crud_api.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.crud_api.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, UUID> {

}
