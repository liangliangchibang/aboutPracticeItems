package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    //注入用户Service

    @Autowired
    private UserService userService;

    //查询所有用户
    @RequestMapping("/userList")
    public List<User> getAllUsers() {
        List<User> list = this.userService.getAllUsers();
        System.out.println("-----------------------------" + list.get(1).getAddress() + "-----------------------------");
        return list;
    }

    //删除用户
    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.userService.deleteUser(id);
    }
}
