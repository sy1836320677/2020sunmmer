package com.web.play.service.impl;

import com.web.play.entity.OrderDetail;
import com.web.play.dao.OrderDetailDao;

import com.web.play.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-07-10 15:48:38
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {
    @Resource
    private OrderDetailDao orderDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderDetailId 主键
     * @return 实例对象
     */
    @Override
    public OrderDetail queryById(Integer orderDetailId) {
        return this.orderDetailDao.queryById(orderDetailId);
    }

    @Override
    public OrderDetail queryByOrderId(String orderId) {
        return this.orderDetailDao.queryByOrderId(orderId);
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderDetail> queryAllByLimit(int offset, int limit) {
        return this.orderDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail insert(OrderDetail orderDetail) {
        this.orderDetailDao.insert(orderDetail);
        return orderDetail;
    }

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        this.orderDetailDao.update(orderDetail);
        return this.queryById(orderDetail.getOrderDetailId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderDetailId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderDetailId) {
        return this.orderDetailDao.deleteById(orderDetailId) > 0;
    }
}