package com.aoyou.demo.service;

import com.aoyou.demo.domain.User;

import java.util.List;

public interface IUserService {

    public int add(User user);


    public int delete(Integer id);


    public List<User> findAll();


    public User findById(Integer id);


    public List<User> findByName(String name);


    public int update(User user);


}

