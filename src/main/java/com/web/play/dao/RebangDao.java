package com.web.play.dao;

import com.web.play.entity.Rebang;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Rebang)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-12 16:14:22
 */
public interface RebangDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bookId 主键
     * @return 实例对象
     */
    Rebang queryById(Long bookId);
    List<Rebang> queryAll1();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Rebang> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param rebang 实例对象
     * @return 对象列表
     */
    List<Rebang> queryAll(Rebang rebang);

    /**
     * 新增数据
     *
     * @param rebang 实例对象
     * @return 影响行数
     */
    int insert(Rebang rebang);

    /**
     * 修改数据
     *
     * @param rebang 实例对象
     * @return 影响行数
     */
    int update(Rebang rebang);

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 影响行数
     */
    int deleteById(Integer bookId);

}