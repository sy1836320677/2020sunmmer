package com.web.play.service.impl;

import com.web.play.dao.RebangDao;
import com.web.play.entity.Rebang;
import com.web.play.service.RebangService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Rebang)表服务实现类
 *
 * @author makejava
 * @since 2020-07-12 16:14:23
 */
@Service("rebangService")
public class RebangServiceImpl implements RebangService {
    @Resource
    private RebangDao rebangDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bookId 主键
     * @return 实例对象
     */
    @Override
    public Rebang queryById(Long bookId) {
        return this.rebangDao.queryById(bookId);
    }

    @Override
    public List<Rebang> queryAll1() {
        return this.rebangDao.queryAll1();
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Rebang> queryAllByLimit(int offset, int limit) {
        return this.rebangDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rebang 实例对象
     * @return 实例对象
     */
    @Override
    public Rebang insert(Rebang rebang) {
        this.rebangDao.insert(rebang);
        return rebang;
    }

    /**
     * 修改数据
     *
     * @param rebang 实例对象
     * @return 实例对象
     */
    @Override
    public Rebang update(Rebang rebang) {
        this.rebangDao.update(rebang);
        return this.queryById(rebang.getBookId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bookId) {
        return this.rebangDao.deleteById(bookId) > 0;
    }
}