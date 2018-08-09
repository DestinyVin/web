package com.vin.web.domain.repository;

import com.vin.web.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);

    long deleteById(Long id);
}
