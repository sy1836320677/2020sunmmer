package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.User;
import com.web.play.service.UserService;
import com.web.play.util.TokenUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-07-09 18:03:16
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;


    @RequestMapping("/chongzhi")
    public String selectOne(@RequestParam("money") Integer moeny) {
        int code =0 ;
        String userId = TokenUtil.getTokenUserId();
        User user =userService.queryById(Integer.parseInt(userId));
        user.setMoney(user.getMoney()+moeny);
        userService.update(user);
        HashMap<String,Object> res= new HashMap<>();
        res.put("code",code);
        String res_json= JSON.toJSONString(res);
        return res_json;


    }

}