package com.web.play.service;

import com.web.play.entity.UserCluster;
import java.util.List;

/**
 * (UserCluster)表服务接口
 *
 * @author makejava
 * @since 2020-07-11 17:01:35
 */
public interface UserClusterService {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    UserCluster queryById(Integer userid);

    List<UserCluster> queryByCId(Integer userclusterid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserCluster> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userCluster 实例对象
     * @return 实例对象
     */
    UserCluster insert(UserCluster userCluster);

    /**
     * 修改数据
     *
     * @param userCluster 实例对象
     * @return 实例对象
     */
    UserCluster update(UserCluster userCluster);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userid);

}