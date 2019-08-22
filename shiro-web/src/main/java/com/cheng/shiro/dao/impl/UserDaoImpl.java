package com.cheng.shiro.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cheng.shiro.dao.UserDao;
import com.cheng.shiro.vo.User;
import org.springframework.stereotype.Repository;

/**
 * @author chengchenrui
 * @version Id: UserDaoImpl.java, v 0.1 2018/6/29 1:06 chengchenrui Exp $$
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public User getUserByUsername(String username) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("f6fdffe48c908deb0f4c3bd36c032e72");
        return user;
    }

    @Override
    public List<String> getRolesByUserName(String username) {
        List<String> list = new ArrayList<>();
        list.add("admin");
        return list;
    }
}