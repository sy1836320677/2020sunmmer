package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.service.BookInfoService;
import com.web.play.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class MysjController {
    @Autowired
    BookInfoService bookInfoService;
    @RequestMapping(value = "/mysj")
    public String mysj() {
        String userId = TokenUtil.getTokenUserId();
        List list = bookInfoService.queryByCname(userId);
        HashMap<String, Object> res = new HashMap<>();
        res.put("list",list);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
