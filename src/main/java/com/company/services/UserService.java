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

//    public List<User> getAll(String name, String surname, String email, String password) {
//        return userRepository.getAll(name, surname, email, password);
//    }
    public List<User> getAll() {
        return userRepository.findAll();
    }


    public User findByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }


//    public boolean updateUser(User u) {
//        return userRepository.updateUser(u);
//    }


    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }
    public String removeUserByName(String name) {
        userRepository.deleteUserByName(name);
        return "delete successfully";
    }


    public User getById(Long id) {
        return userRepository.getById(id);
    }


    public User addUser(User user) {
        return userRepository.save(user);
    }

}
