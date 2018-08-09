package com.vin.web.service;

import com.vin.web.domain.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void save(User user);

    User findUserById(long id);

    void edit(User user);

    void delete(long id);

}
