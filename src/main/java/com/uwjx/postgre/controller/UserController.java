package com.uwjx.postgre.controller;

import com.alibaba.fastjson.JSON;
import com.uwjx.postgre.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Huan
 * @author 18501667737@163.com
 * @date 2021/3/8 11:23
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "list")
    public String list(){
        String resp = JSON.toJSONString(userService.list());
        return resp;
    }
}
