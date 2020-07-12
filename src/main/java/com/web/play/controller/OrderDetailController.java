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
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Random;

/**
 * (OrderDetail)表控制层
 *
 * @author makejava
 * @since 2020-07-10 15:48:38
 */
@RestController
@CrossOrigin
public class OrderDetailController {
    /**
     * 服务对象
     */
    @Resource
    private OrderDetailService orderDetailService;
    @Autowired
    BookInfoService bookInfoService;
    @Autowired
    UserService userService;
    @Autowired
    OrdersService ordersService;

    @RequestMapping(value = "/dingdan")
    public String dingdan(@RequestParam("rentid") String name) {
        String userId = TokenUtil.getTokenUserId();
        BookInfo book = bookInfoService.queryByName(name);
        User us = userService.queryById(Integer.parseInt(userId));
        Double money = us.getMoney();
        Double price = book.getPrice();
        Long bookId = book.getBookId();
        HashMap<String, Object> res = new HashMap<>();
        if (money < price){

            res.put("code",1);
        }
        else {
            us.setMoney(money - price);
            System.out.println(us);
            userService.update(us);
            Orders orders = new Orders();
            orders.setPayment(String.valueOf(price));
            orders.setUserId(Integer.parseInt(userId));
            Random random = new Random();
            int Id = random.nextInt(100000000)+10000002;
            orders.setOrderId(Integer.toString(Id));
            orders.setStatus(1);
            ordersService.insert(orders);
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setBookName(name);
            orderDetail.setOrderId(Integer.toString(Id));
            orderDetail.setUnitPrice(price);
            orderDetail.setBookId(bookId);
            orderDetail.setPostStatus("1");
            orderDetailService.insert(orderDetail);
            res.put("code", 0);
        }
        String res_json = JSON.toJSONString(res);
        return res_json;
    }

}