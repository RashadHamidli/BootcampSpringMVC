package com.company;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Louncher {
    private final UserService userService;

    public Louncher(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Louncher.class, args);
    }

    @Component
    class WriteDate implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            startInstance();
        }
    }

    public void startInstance() {
        userService.getAll().stream().toList().forEach(System.out::println);

    }

}
