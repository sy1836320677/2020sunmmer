package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.entity.Rebang;
import com.web.play.service.BookInfoService;
import com.web.play.service.RebangService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * (Rebang)表控制层
 *
 * @author makejava
 * @since 2020-07-12 16:14:23
 */
@RestController
public class RebangController {
    /**
     * 服务对象
     */
    @Resource
    private RebangService rebangService;
    private BookInfoService bookInfoService;

    public RebangController(BookInfoService bookInfoService) {
        this.bookInfoService = bookInfoService;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/rebang")
    public String selectOne(Integer id) {

        List<Rebang> list = this.rebangService.queryAll1();
        List<BookInfo>  bookInfoList= new ArrayList<>();
        HashMap<String,Object> res= new HashMap<>();
        int i=0;
        for(Rebang rebang :list)
        {
            BookInfo bookInfo = bookInfoService.queryById(rebang.getBookId());
            bookInfoList.add(bookInfo) ;
            i++;
            res.put("list",bookInfoList);
            if(i==20)
            {
                break;
            }
        }

        String res_json= JSON.toJSONString(res);
        return res_json;

    }


}