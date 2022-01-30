package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.Role;
import com.example.DemoLoginLogout.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
