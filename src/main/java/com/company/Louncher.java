package com.company;

import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Optional;


@SpringBootApplication
public class Louncher implements CommandLineRunner {
    private final UserService userService;

    public Louncher(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Louncher.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        startApp();
    }

    public void startApp(){
        User user = userService.findAllByEmail("mr_rashad@email.com");
        System.out.println(user);
    }

}
