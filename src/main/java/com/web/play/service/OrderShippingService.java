package com.web.play.service;

import com.web.play.entity.OrderShipping;
import java.util.List;

/**
 * (OrderShipping)表服务接口
 *
 * @author makejava
 * @since 2020-07-10 15:52:28
 */
public interface OrderShippingService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    OrderShipping queryById(String orderId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderShipping> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderShipping 实例对象
     * @return 实例对象
     */
    OrderShipping insert(OrderShipping orderShipping);

    /**
     * 修改数据
     *
     * @param orderShipping 实例对象
     * @return 实例对象
     */
    OrderShipping update(OrderShipping orderShipping);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(String orderId);

}