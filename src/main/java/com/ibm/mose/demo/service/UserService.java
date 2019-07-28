package com.ibm.mose.demo.service;

import com.ibm.mose.demo.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> find(User user);
    List<User> list();
}
