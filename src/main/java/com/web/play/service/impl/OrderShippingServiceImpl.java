package com.web.play.service.impl;

import com.web.play.entity.OrderShipping;
import com.web.play.dao.OrderShippingDao;
import com.web.play.service.OrderShippingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderShipping)表服务实现类
 *
 * @author makejava
 * @since 2020-07-10 15:52:28
 */
@Service("orderShippingService")
public class OrderShippingServiceImpl implements OrderShippingService {
    @Resource
    private OrderShippingDao orderShippingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public OrderShipping queryById(String orderId) {
        return this.orderShippingDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderShipping> queryAllByLimit(int offset, int limit) {
        return this.orderShippingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public OrderShipping insert(OrderShipping orderShipping) {
        this.orderShippingDao.insert(orderShipping);
        return orderShipping;
    }

    /**
     * 修改数据
     *
     * @param orderShipping 实例对象
     * @return 实例对象
     */
    @Override
    public OrderShipping update(OrderShipping orderShipping) {
        this.orderShippingDao.update(orderShipping);
        return this.queryById(orderShipping.getOrderId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderId) {
        return this.orderShippingDao.deleteById(orderId) > 0;
    }
}