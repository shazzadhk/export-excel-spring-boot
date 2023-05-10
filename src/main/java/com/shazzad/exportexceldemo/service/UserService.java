package com.shazzad.exportexceldemo.service;

import com.shazzad.exportexceldemo.entity.Users;
import com.shazzad.exportexceldemo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public List<Users> saveAllUser(List<Users> usersList) {
        return userDao.saveAll(usersList);
    }

    public List<Users> getAllUsers() {

        return userDao.findAll();
    }
}
