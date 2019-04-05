package com.ibm.mose.demo.dao;

import java.util.List;

import com.ibm.mose.demo.model.User;

public interface UserDao {
   void save(User user);
   List<User> list();
}
