package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.entity.OrderDetail;

import com.web.play.service.BookInfoService;
import com.web.play.service.OrderDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * (BookInfo)表控制层
 *
 * @author makejava
 * @since 2020-07-09 18:10:57
 */
@RestController
public class BookInfoController {
    /**
     * 服务对象
     */
    @Resource
    private BookInfoService bookInfoService;

    private OrderDetailService orderDetailService;

    public BookInfoController(BookInfoService bookInfoService, OrderDetailService orderDetailService) {
        this.bookInfoService = bookInfoService;
        this.orderDetailService = orderDetailService;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/q")
    public String selectOne(Long id) {

        return "" ;

    }

}