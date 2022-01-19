package com.example.userservice;

import com.example.userservice.models.Role;
import com.example.userservice.models.User;
import com.example.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Doumbia Al Moustapha","AlMoustapha","12345678",new ArrayList<>()));
			userService.saveUser(new User(null,"Koné Franck","Franck","12345678",new ArrayList<>()));
			userService.saveUser(new User(null,"Koffi Cyrille","Cyrille","12345678",new ArrayList<>()));
			userService.saveUser(new User(null,"N'Guessan Aroune","NAroune","12345678",new ArrayList<>()));

			userService.addRoleToUser("AlMoustapha","ROLE_USER");
			userService.addRoleToUser("AlMoustapha","ROLE_ADMIN");
			userService.addRoleToUser("AlMoustapha","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("Franck","ROLE_USER");
			userService.addRoleToUser("Cyrille","ROLE_MANAGER");
			userService.addRoleToUser("NAroune","ROLE_ADMIN");

		};
	}



}
