package com.web.play.dao;

import com.web.play.entity.OrderDetail;

import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 15:48:38
 */
public interface OrderDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderDetailId 主键
     * @return 实例对象
     */
    OrderDetail queryById(Integer orderDetailId);
    OrderDetail queryByOrderId(String orderId);


    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderDetail 实例对象
     * @return 对象列表
     */
    List<OrderDetail> queryAll(OrderDetail orderDetail);

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 影响行数
     */
    int insert(OrderDetail orderDetail);

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 影响行数
     */
    int update(OrderDetail orderDetail);

    /**
     * 通过主键删除数据
     *
     * @param orderDetailId 主键
     * @return 影响行数
     */
    int deleteById(Integer orderDetailId);

}