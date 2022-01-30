package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.AppUser;

import java.util.List;

public interface UserService {

    AppUser saveUser(AppUser user);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
