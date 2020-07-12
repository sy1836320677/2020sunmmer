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
import java.util.*;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2020-07-10 15:52:40
 */
@RestController
@CrossOrigin
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;
    @Autowired
    BookInfoService bookInfoService;
    @Autowired
    UserService userService;
    @Autowired
    OrderDetailService orderDetailService;



    @RequestMapping(value = "/shopcar")
    public String shopcar(@RequestParam("rentid") String name) {
        String userId = TokenUtil.getTokenUserId();
        BookInfo book = bookInfoService.queryByName(name);
        Double price = book.getPrice();
        Orders orders = new Orders();
        Long bookId = book.getBookId();
        orders.setPayment(String.valueOf(book.getPrice()));
        orders.setUserId(Integer.parseInt(userId));
        Random random = new Random();
        int Id = random.nextInt(10000);
        orders.setOrderId(Integer.toString(Id));
        orders.setStatus(0);
        ordersService.insert(orders);
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setBookName(name);
        orderDetail.setOrderId(Integer.toString(Id));
        orderDetail.setUnitPrice(price);
        orderDetail.setBookId(bookId);
        orderDetail.setPostStatus("0");
        orderDetailService.insert(orderDetail);
        HashMap<String, Object> res = new HashMap<>();
        res.put("code",0);
        res.put("id",Id);
        String res_json = JSON.toJSONString(res);
        return res_json;
    }






}