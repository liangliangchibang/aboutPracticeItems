package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    //注入用户Mapper
    @Autowired
    private UserMapper userMapper;

    //查询所有用户
    @Override
    public List<User> getAllUsers() {
        System.out.println("---------------------------UserServiceImpl-------------------------------");
        return this.userMapper.getAllUsers();
    }

    //删除用户
    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除了id为" + id + "的用户");
        this.userMapper.delete(id);
    }
}
