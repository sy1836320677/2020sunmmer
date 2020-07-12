package com.web.play.service;

import com.web.play.entity.OrderDetail;


import java.util.List;

/**
 * (OrderDetail)表服务接口
 *
 * @author makejava
 * @since 2020-07-10 15:48:38
 */
public interface OrderDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderDetailId 主键
     * @return 实例对象
     */
    OrderDetail queryById(Integer orderDetailId);

    OrderDetail queryByOrderId(String orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail insert(OrderDetail orderDetail);

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail update(OrderDetail orderDetail);

    /**
     * 通过主键删除数据
     *
     * @param orderDetailId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderDetailId);

}