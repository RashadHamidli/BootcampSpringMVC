package com.company.services;

import com.company.dao.UserRepository;
import com.company.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> updateUser(Long id, User newUser) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User foundUser = user.get();
            foundUser.setName(newUser.getName());
            foundUser.setSurname(newUser.getSurname());
            foundUser.setEmail(newUser.getEmail());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
        }
        return null;
    }

    public String removeUserById(Long id) {
        userRepository.deleteById(id);
        return "delete successfully";
    }

    public String removeUserByName(String name) {
        userRepository.deleteUserByName(name);
        return "delete successfully";
    }


    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }


    public User addUser(User user) {
        return userRepository.save(user);
    }

}
