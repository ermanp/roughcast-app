package com.sakulta.roughcastapp.repository;


import com.sakulta.roughcastapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by temelt on 3.02.2019.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
