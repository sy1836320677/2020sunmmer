package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.entity.Usermahhadres;
import com.web.play.service.BookInfoService;
import com.web.play.service.UsermahhadresService;
import com.web.play.util.TokenUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 * (Usermahhadres)表控制层
 *
 * @author makejava
 * @since 2020-07-09 17:20:19
 */
@RestController
@CrossOrigin
public class UsermahhadresController {
    /**
     * 服务对象
     */
    @Resource
    private UsermahhadresService usermahhadresService;
    private BookInfoService bookInfoService;
    private  Usermahhadres usermahhadres;

    public UsermahhadresController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }



    @RequestMapping("/baseuser")
    public String selectOne() {
        //bookInfoService.queryAllByLimit()
        String userId = TokenUtil.getTokenUserId();
        usermahhadres= usermahhadresService.queryById(Integer.parseInt(userId));//得到推荐表中的一条数据 根据ID
       //拆解string
        List<String> strlist=new ArrayList<String>();
        StringTokenizer st=new StringTokenizer(usermahhadres.getUserrecommend(),",");
        while(st.hasMoreTokens()){
            strlist.add(st.nextToken());
            System.out.println(st.nextToken()+"zheshi str");
        }
        List<BookInfo> list=new ArrayList<>();

        HashMap<String,Object> res= new HashMap<>();
        for(int i=0;i<strlist.size();i++) {
                System.out.println(Long.parseLong(strlist.get(i)));
                BookInfo bookInfo  =this.bookInfoService.queryById(Long.parseLong(strlist.get(i)));
                list.add(bookInfo);
                res.put("list",list);
        }
        String res_json= JSON.toJSONString(res);
        return res_json;
    }

}