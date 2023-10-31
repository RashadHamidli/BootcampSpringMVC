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

    @Query(value = "select * from user where id=?1", nativeQuery = true)
    User findByNameToId(Long id);
}
