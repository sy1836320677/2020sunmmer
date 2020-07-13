package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.service.BookInfoService;
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
public class ShoplistController {
    @Autowired
    BookInfoService bookInfoService;
    @RequestMapping(value = "/shoplist")
    public String shoplist(@RequestParam("kind") int cateId) {
        List list = bookInfoService.queryByCateId(cateId);
        HashMap<String, Object> res = new HashMap<>();
        res.put("list",list);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}
