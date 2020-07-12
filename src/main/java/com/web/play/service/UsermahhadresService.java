package com.web.play.service;

import com.web.play.entity.Usermahhadres;
import java.util.List;

/**
 * (Usermahhadres)表服务接口
 *
 * @author makejava
 * @since 2020-07-11 17:02:05
 */
public interface UsermahhadresService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    Usermahhadres queryById(Integer userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Usermahhadres> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param usermahhadres 实例对象
     * @return 实例对象
     */
    Usermahhadres insert(Usermahhadres usermahhadres);

    /**
     * 修改数据
     *
     * @param usermahhadres 实例对象
     * @return 实例对象
     */
    Usermahhadres update(Usermahhadres usermahhadres);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);

}