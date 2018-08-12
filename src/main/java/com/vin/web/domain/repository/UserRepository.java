package com.vin.web.domain.repository;

import com.vin.web.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    User findUserById(Long id);

    void deleteUserById(Long id);
}
