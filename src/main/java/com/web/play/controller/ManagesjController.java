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
public class ManagesjController {
    @Autowired
    BookInfoService bookInfoService;
    @RequestMapping(value = "/managesj")
    public String managesj(@RequestParam("name") String name,@RequestParam("outline") String outline,@RequestParam("press") String press,@RequestParam("author") String author,@RequestParam("price") Double price,@RequestParam("detail") String detail) {
        String userId = TokenUtil.getTokenUserId();
        BookInfo bookInfo = new BookInfo();
        bookInfo.setName(name);
        bookInfo.setOutline(outline);
        bookInfo.setPress(press);
        bookInfo.setAuthor(author);
        bookInfo.setPrice(price);
        bookInfo.setDetail(detail);
        bookInfo.setBookCategoryId(1);
        bookInfo.setCname(userId);
        bookInfoService.insert(bookInfo);
        HashMap<String, Object> res = new HashMap<>();
        res.put("code",0);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }
}