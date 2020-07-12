package com.web.play.dao;

import com.web.play.entity.OrderShipping;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (OrderShipping)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 15:52:28
 */
public interface OrderShippingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    OrderShipping queryById(String orderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderShipping> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderShipping 实例对象
     * @return 对象列表
     */
    List<OrderShipping> queryAll(OrderShipping orderShipping);

    /**
     * 新增数据
     *
     * @param orderShipping 实例对象
     * @return 影响行数
     */
    int insert(OrderShipping orderShipping);

    /**
     * 修改数据
     *
     * @param orderShipping 实例对象
     * @return 影响行数
     */
    int update(OrderShipping orderShipping);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(String orderId);

}