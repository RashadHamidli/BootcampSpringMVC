package com.company.dao;

import com.company.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("INSERT INTO User u (u.name, u.surname, u.email, u.password) VALUES (:name, :surname, :email, :password)")
    User createUser(@Param("name") String name, @Param("surname") String surname, @Param("email") String email, @Param("password") String password);

}
