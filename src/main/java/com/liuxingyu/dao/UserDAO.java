package com.liuxingyu.dao;

import com.liuxingyu.domain.User;

import java.util.List;

public interface UserDAO {
    public User queryById(int id);

    public List<User> queryAll();
}
