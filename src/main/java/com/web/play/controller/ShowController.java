package com.web.play.controller;

import com.alibaba.fastjson.JSON;
import com.web.play.entity.BookInfo;
import com.web.play.entity.OrderDetail;
import com.web.play.entity.Orders;
import com.web.play.entity.User;
import com.web.play.service.BookInfoService;
import com.web.play.service.OrderDetailService;
import com.web.play.service.OrdersService;
import com.web.play.service.UserService;
import com.web.play.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
public class ShowController{

    @Autowired
    UserService userService;
    @Autowired
    OrdersService ordersService;
    @Autowired
    OrderDetailService orderDetailService;
    @Autowired
    BookInfoService bookInfoService;

    @RequestMapping(value = "/showcar")
    public String showcar() {
        String orderId = null;
        OrderDetail orderDetail = new OrderDetail();
        String userId = TokenUtil.getTokenUserId();
        HashMap<String, Object> res = new HashMap<>();
        List<Orders> orders = ordersService.queryByUserId(userId);
        List <String> orderIds = new ArrayList();
        for(int i=0;i<orders.size();i++){
            orderId = orders.get(i).getOrderId();
            orderIds.add(orderId);
        }
        List <OrderDetail> orderDetails= new ArrayList();
        for(int j=0;j<orderIds.size();j++){

            orderDetail=orderDetailService.queryByOrderId(orderIds.get(j));
            if(orderDetail.getPostStatus().equals("0")) {
                orderDetails.add(orderDetail);
            }
        }
        List <BookInfo> list = new ArrayList();;
        for(int i = 0;i < orderDetails.size();i ++){
            list.add(bookInfoService.queryById(orderDetails.get(i).getBookId()));
        }
        User us = userService.queryById(Integer.parseInt(userId));
        Double money = us.getMoney();
        res.put("list",list);
        res.put("money",money);
        String res_json = JSON.toJSONString(res);
        return res_json;

    }
}