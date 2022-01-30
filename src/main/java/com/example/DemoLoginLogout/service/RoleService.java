package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.Role;

import java.util.List;

public interface RoleService {

    Role saveRole(Role role);
    List<Role> getRoles();


}
