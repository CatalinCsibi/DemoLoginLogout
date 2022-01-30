package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.Role;
import com.example.DemoLoginLogout.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RoleServiceImplTest {


    @Mock
    RoleRepository roleRepository;

    @InjectMocks
    RoleServiceImpl roleService;

    @Test
    public void when_saveRole_should_return_role() {
        Role role = new Role(null, "ROLE_USER");
        when(roleRepository.save(any(Role.class))).thenReturn(role);

        Role createdRole = roleRepository.save(role);

        assertThat(createdRole.getName()).isSameAs(role.getName());
        assertThat(createdRole.getId()).isSameAs(createdRole.getId());
    }
}
