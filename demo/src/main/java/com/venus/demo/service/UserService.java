package com.venus.demo.service;

import com.venus.demo.dao.model.User;

import java.util.List;

public interface UserService {

    List<User> findUserList(User user);

    int deleteUsrByName(User user);
}
