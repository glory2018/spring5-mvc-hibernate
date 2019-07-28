package com.ibm.mose.demo.dao;

import com.ibm.mose.demo.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    List<User> find(User user);
    List<User> list();
}
