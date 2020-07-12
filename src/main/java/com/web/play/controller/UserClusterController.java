package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.User;
import com.web.play.entity.UserCluster;
import com.web.play.service.UserClusterService;
import com.web.play.service.UserService;
import com.web.play.util.TokenUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * (UserCluster)表控制层
 *
 * @author makejava
 * @since 2020-07-11 17:01:35
 */
@RestController
@RequestMapping("userCluster")
public class UserClusterController {
    /**
     * 服务对象
     */
    @Resource
    private UserClusterService userClusterService;
    private UserService userService;

    public UserClusterController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("selectOne")
    public String selectOne() {
        //当前用户id
        String userId = TokenUtil.getTokenUserId();
        List<UserCluster> list = userClusterService.queryByCId( userClusterService.queryById(Integer.parseInt(userId)).getUserclusterid());
        List<User> userList =new ArrayList<>();
        HashMap<String,Object> res= new HashMap<>();
        for (UserCluster userCluster :list){
            if(userCluster.getUserid()!=Integer.parseInt(userId)) {
                User user = userService.queryById(userCluster.getUserid());
                userList.add(user);
            }

        }
        res.put("list",userList);
        String res_json= JSON.toJSONString(res);
        return res_json;
    }



}