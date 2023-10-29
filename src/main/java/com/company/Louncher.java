package com.company;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class Louncher {

    public static void main(String[] args) {
        SpringApplication.run(Louncher.class, args);
    }
    @Component
    class WriteDate implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println(LocalDate.now());
        }

    }

//    @Component
//    class WriteTime implements ApplicationRunner {
//
//        @Override
//        public void run(ApplicationArguments args) throws Exception {
//            System.out.println(LocalTime.now());
//        }
//
//    }


}
