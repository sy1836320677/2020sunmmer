package com.web.play.dao;

import com.web.play.entity.Usermahhadres;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Usermahhadres)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 13:13:02
 */
public interface UsermahhadresDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Usermahhadres queryById(Integer userid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Usermahhadres> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param usermahhadres 实例对象
     * @return 对象列表
     */
    List<Usermahhadres> queryAll(Usermahhadres usermahhadres);

    /**
     * 新增数据
     *
     * @param usermahhadres 实例对象
     * @return 影响行数
     */
    int insert(Usermahhadres usermahhadres);

    /**
     * 修改数据
     *
     * @param usermahhadres 实例对象
     * @return 影响行数
     */
    int update(Usermahhadres usermahhadres);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

}