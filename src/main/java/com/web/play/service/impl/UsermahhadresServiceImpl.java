package com.web.play.service.impl;

import com.web.play.entity.Usermahhadres;
import com.web.play.dao.UsermahhadresDao;
import com.web.play.service.UsermahhadresService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Usermahhadres)表服务实现类
 *
 * @author makejava
 * @since 2020-07-11 17:02:05
 */
@Service("usermahhadresService")
public class UsermahhadresServiceImpl implements UsermahhadresService {
    @Resource
    private UsermahhadresDao usermahhadresDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public Usermahhadres queryById(Integer userid) {
        return this.usermahhadresDao.queryById(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Usermahhadres> queryAllByLimit(int offset, int limit) {
        return this.usermahhadresDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param usermahhadres 实例对象
     * @return 实例对象
     */
    @Override
    public Usermahhadres insert(Usermahhadres usermahhadres) {
        this.usermahhadresDao.insert(usermahhadres);
        return usermahhadres;
    }

    /**
     * 修改数据
     *
     * @param usermahhadres 实例对象
     * @return 实例对象
     */
    @Override
    public Usermahhadres update(Usermahhadres usermahhadres) {
        this.usermahhadresDao.update(usermahhadres);
        return this.queryById(usermahhadres.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.usermahhadresDao.deleteById(userid) > 0;
    }
}