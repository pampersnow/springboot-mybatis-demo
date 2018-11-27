package com.demo.springbootmybatisdemo.service.impl;

import com.demo.springbootmybatisdemo.mapper.UserMapper;
import com.demo.springbootmybatisdemo.model.User;
import com.demo.springbootmybatisdemo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//如果这里报错，并不会影响

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    /**
     *功能描述
     * @type    这个方法中用到了开头配置依赖的分页插件pagehelper
     * @params  只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum  开始页数
     * pageSize 每页显示的数据条数
     * @return  userMapper.selectAllUser();
     */
    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAllUser();
    }
}
