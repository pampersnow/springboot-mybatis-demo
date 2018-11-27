package com.demo.springbootmybatisdemo.mapper;

import com.demo.springbootmybatisdemo.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //分页查询所有用户
    List<User> selectAllUser();
}