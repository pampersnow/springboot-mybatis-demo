package com.demo.springbootmybatisdemo.service;

import com.demo.springbootmybatisdemo.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> findAllUser(int pageNum, int pageSize);
}
