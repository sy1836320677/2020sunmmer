package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.User;
import com.web.play.service.UserService;
import com.web.play.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
@CrossOrigin
public class GetInfoController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/getInfo")
    public String getInfo() {
        String userId = TokenUtil.getTokenUserId();
        User info = userService.queryById(Integer.parseInt(userId));
        HashMap<String, Object> res = new HashMap<>();
        res.put("info",info);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
