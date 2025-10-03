package com.pankaj.crud_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pankaj.crud_api.models.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
