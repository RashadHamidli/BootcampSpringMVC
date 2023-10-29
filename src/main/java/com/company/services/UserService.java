package com.company.services;

import com.company.dao.UserRepository;
import com.company.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(String name, String surname, Integer nationalityId) {
        return userRepository.getAll(name, surname, nationalityId);
    }


    public User findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


    public boolean updateUser(User u) {
        return userRepository.updateUser(u);
    }


    public boolean removeUser(int id) {
        return userRepository.removeUser(id);
    }

    public User getById(int userId) {
        return userRepository.getById(userId);
    }


    public boolean addUser(User u) {
        return userRepository.addUser(u);
    }

}
