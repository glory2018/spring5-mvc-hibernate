package com.ibm.mose.demo.service;

import java.util.List;

import com.ibm.mose.demo.model.User;

public interface UserService {
   void save(User user);

   List<User> list();
}
