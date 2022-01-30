package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.Role;
import com.example.DemoLoginLogout.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getRoles() {
        log.info("Fetching all roles from database");
        return roleRepository.findAll();
    }

}
