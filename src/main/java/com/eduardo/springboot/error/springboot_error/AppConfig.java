package com.eduardo.springboot.error.springboot_error;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.eduardo.springboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "ISDH", "ISDH"));
        users.add(new User(2L, "Eduardo", "Ramos"));
        users.add(new User(3L, "Charles", "Ramos"));
        users.add(new User(4L, "Naomi", "Gonzalez"));
        users.add(new User(5L, "Juana", "Perez"));

        return users;
    }
}
