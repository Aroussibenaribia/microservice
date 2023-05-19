package com.aroussi.authmicroservice.repositories;

import com.aroussi.authmicroservice.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
