package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.dao.UserDao;
import com.web.play.entity.User;
import com.web.play.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class LoginController {
    @Autowired
    UserDao userDao;
    @Autowired
    TokenService tokenService;

    @PostMapping (value = "/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password) {

        int code = 1;
        User us = userDao.queryByUsername(username);
        HashMap<String, Object> res = new HashMap<>();

        if (us != null && password.equals(us.getPassword())) {
           code = 0;
        }

        res.put("code", code);
        String token = tokenService.getToken(us);
        res.put("token", token);
        res.put("user", us);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }

}
