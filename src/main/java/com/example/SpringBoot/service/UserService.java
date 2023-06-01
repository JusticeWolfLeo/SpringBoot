package com.example.SpringBoot.service;

import com.example.SpringBoot.entity.User;

import java.util.List;

public interface UserService {
    User getById(Long id);
    List<User> findAll();
    User save(User user);
    User update(User user);
    void deleteById(Long id);
}
