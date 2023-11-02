package com.company.controller;

import com.company.dto.UserDTO;
import com.company.entity.User;
import com.company.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserRestController {
    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> get() {
        List<User> users = userService.getAll();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        userService.addUser(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public String removeUser(@PathVariable Long id) {
        userService.removeUserById(id);
        return "delete successfully";
    }

//    @PostMapping("/update/{id}")
//    public ResponseEntity<String> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
//        Optional<User> optionalUser = userService.findById(id);
//        if (optionalUser.isPresent()) {
//            User user = optionalUser.get();
//            user.setName(userDTO.getName());
//            user.setSurname(userDTO.getSurname());
//            user.setEmail(userDTO.getEmail());
//            user.setPassword(userDTO.getPassword());
//            userService.updateUser(id, user);
//            return ResponseEntity.ok("Update successfully");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
//        }
//    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        Optional<User> optionalUser = userService.findById(id);
        if (optionalUser.isPresent()) {
            User user = new User();
            user.setName(userDTO.getName());
            user.setSurname(userDTO.getSurname());
            user.setEmail(userDTO.getEmail());
            user.setPassword(userDTO.getPassword());
            System.out.println("user =" + user);
            userService.updateUser(id, user);
            return ResponseEntity.ok("Update successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        }

    }
