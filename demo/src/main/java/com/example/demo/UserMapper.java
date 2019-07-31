package com.example.demo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //查询所有用户
    @Select("Select * from springbootdemouser")
    List<User> getAllUsers();

    //删除用户
    @Delete("Delete from springbootdemouser where id =# {id}")
    void delete(Integer id);


}
