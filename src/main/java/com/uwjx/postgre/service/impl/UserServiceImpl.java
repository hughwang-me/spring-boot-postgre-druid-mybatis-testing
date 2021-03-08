package com.uwjx.postgre.service.impl;

import com.uwjx.postgre.dao.UserMapper;
import com.uwjx.postgre.entity.User;
import com.uwjx.postgre.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wang Huan
 * @author 18501667737@163.com
 * @date 2021/3/8 14:44
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> users = userMapper.list();
        return users;
    }
}
