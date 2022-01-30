package com.example.DemoLoginLogout;

import com.example.DemoLoginLogout.model.AppUser;
import com.example.DemoLoginLogout.model.Role;
import com.example.DemoLoginLogout.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DemoLoginLogoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLoginLogoutApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));




			userService.saveUser(new AppUser(null, "George",
					"Georgescu", "george90", "password", new ArrayList<>()));

			userService.saveUser(new AppUser(null, "James",
					"Hetfield", "James90", "password1", new ArrayList<>()));

			userService.saveUser(new AppUser(null, "Bruce",
					"Springsteen", "Bruce90", "password2", new ArrayList<>()));

			userService.addRoleToUser("george90", "ROLE_USER");
			userService.addRoleToUser("James90", "ROLE_ADMIN");
			userService.addRoleToUser("Bruce90", "ROLE_USER");

		};
	}

}
