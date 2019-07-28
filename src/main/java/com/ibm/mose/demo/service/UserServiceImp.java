package com.ibm.mose.demo.service;

import com.ibm.mose.demo.dao.UserDao;
import com.ibm.mose.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> find(User user) {
        return userDao.find(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> list() {
        return userDao.list();
    }
}
