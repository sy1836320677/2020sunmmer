package com.web.play.service;

import com.web.play.entity.Rebang;

import java.util.List;

/**
 * (Rebang)表服务接口
 *
 * @author makejava
 * @since 2020-07-12 16:14:23
 */
public interface RebangService {

    /**
     * 通过ID查询单条数据
     *
     * @param bookId 主键
     * @return 实例对象
     */
    Rebang queryById(Long bookId);
    List<Rebang> queryAll1();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Rebang> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rebang 实例对象
     * @return 实例对象
     */
    Rebang insert(Rebang rebang);

    /**
     * 修改数据
     *
     * @param rebang 实例对象
     * @return 实例对象
     */
    Rebang update(Rebang rebang);

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bookId);

}