package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    //查询所有
    List<User> getAllUsers();

    //删除
    void deleteUser(Integer id);
}
