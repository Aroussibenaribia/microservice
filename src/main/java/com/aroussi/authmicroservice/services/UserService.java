package com.aroussi.authmicroservice.services;

import com.aroussi.authmicroservice.entities.Role;
import com.aroussi.authmicroservice.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String roleName);
    List<User> findAllUsers();
}
