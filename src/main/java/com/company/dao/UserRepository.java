package com.company.dao;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    void deleteUserByName(String name);

    @Query(value = "select * from users where email=?1", nativeQuery = true)
    User findAllByEmail(String email);
    @Query(value = "select u from users where email=?1 and password=?2", nativeQuery = true)
    User findUserByEmailAndPassword(String email, String password);
}
