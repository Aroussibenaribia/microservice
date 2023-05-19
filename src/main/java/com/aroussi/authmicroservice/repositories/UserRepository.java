package com.aroussi.authmicroservice.repositories;

import com.aroussi.authmicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
