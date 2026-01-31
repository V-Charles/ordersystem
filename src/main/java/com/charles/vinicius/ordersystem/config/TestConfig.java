package com.charles.vinicius.ordersystem.config;

import com.charles.vinicius.ordersystem.entities.User;
import com.charles.vinicius.ordersystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "999999999", "12345");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "888888888", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
