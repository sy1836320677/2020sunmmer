package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.dao.UserDao;
import com.web.play.entity.User;
import com.web.play.service.TokenService;
import com.web.play.service.UserService;
import com.web.play.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Random;

@RestController
@CrossOrigin
public class RegisterController {

    @Autowired
    UserDao userDao;
    @Autowired
    TokenService tokenService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register")
    public String register(@RequestParam("username") String username,@RequestParam("password") String password) {

        int code = 1;
        HashMap<String, Object> res = new HashMap<>();
        String userId = TokenUtil.getTokenUserId();
        User us = userService.queryByUsername(username);
        User user = new User();
        if (us != null) {
            code = 0;
            res.put("code",code);
            res.put("user",us);
        }
        else{
        res.put("code",code);
        user.setUsername(username);
        user.setPassword(password);
        Random random = new Random();
        int Id = random.nextInt(100000)+300673;
        user.setUserId(Id);
        userService.insert(user);
        res.put("user",user);
    }
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
