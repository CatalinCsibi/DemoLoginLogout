package com.example.DemoLoginLogout.service;

import com.example.DemoLoginLogout.model.AppUser;
import com.example.DemoLoginLogout.model.Role;
import com.example.DemoLoginLogout.repository.RoleRepository;
import com.example.DemoLoginLogout.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Mock
    PasswordEncoder passwordEncoder;

    @Mock
    RoleRepository roleRepository;

    @Test
    public void when_saveUser_should_return_user() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Role(null, "ROLE_USER"));
        AppUser user = new AppUser(null, "George", "Georgescu", "george90", "password", roles);
        when(userRepository.save(any(AppUser.class))).thenReturn(user);

        AppUser createdUser = userService.saveUser(user);

        assertThat(createdUser.getFirstName()).isSameAs(user.getFirstName());
        assertThat(createdUser.getLastName()).isSameAs(user.getLastName());
        assertThat(createdUser.getUsername()).isSameAs(user.getUsername());
        assertThat(createdUser.getRoles()).isSameAs(user.getRoles());

    }

    @Test
    public void when_saveRole_should_return_role() {
        Role role = new Role(null, "ROLE_USER");
        when(roleRepository.save(any(Role.class))).thenReturn(role);

        Role createdRole = roleRepository.save(role);

        assertThat(createdRole.getName()).isSameAs(role.getName());
        assertThat(createdRole.getId()).isSameAs(createdRole.getId());
    }


}
