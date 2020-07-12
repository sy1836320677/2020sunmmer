package com.web.play.service.impl;

import com.web.play.entity.UserCluster;
import com.web.play.dao.UserClusterDao;
import com.web.play.service.UserClusterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserCluster)表服务实现类
 *
 * @author makejava
 * @since 2020-07-11 17:01:35
 */
@Service("userClusterService")
public class UserClusterServiceImpl implements UserClusterService {
    @Resource
    private UserClusterDao userClusterDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public UserCluster queryById(Integer userid) {
        return this.userClusterDao.queryById(userid);
    }

    @Override
    public List<UserCluster> queryByCId(Integer userclusterid) {
        return this.userClusterDao.queryByCId(userclusterid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserCluster> queryAllByLimit(int offset, int limit) {
        return this.userClusterDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userCluster 实例对象
     * @return 实例对象
     */
    @Override
    public UserCluster insert(UserCluster userCluster) {
        this.userClusterDao.insert(userCluster);
        return userCluster;
    }

    /**
     * 修改数据
     *
     * @param userCluster 实例对象
     * @return 实例对象
     */
    @Override
    public UserCluster update(UserCluster userCluster) {
        this.userClusterDao.update(userCluster);
        return this.queryById(userCluster.getUserid());
    }

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer userid) {
        return this.userClusterDao.deleteById(userid) > 0;
    }
}