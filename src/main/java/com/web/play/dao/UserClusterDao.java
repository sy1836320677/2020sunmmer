package com.web.play.dao;

import com.web.play.entity.UserCluster;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserCluster)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-11 17:01:35
 */
public interface UserClusterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    UserCluster queryById(Integer userid);

    List<UserCluster> queryByCId(Integer userclusterid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserCluster> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userCluster 实例对象
     * @return 对象列表
     */
    List<UserCluster> queryAll(UserCluster userCluster);

    /**
     * 新增数据
     *
     * @param userCluster 实例对象
     * @return 影响行数
     */
    int insert(UserCluster userCluster);

    /**
     * 修改数据
     *
     * @param userCluster 实例对象
     * @return 影响行数
     */
    int update(UserCluster userCluster);

    /**
     * 通过主键删除数据
     *
     * @param userid 主键
     * @return 影响行数
     */
    int deleteById(Integer userid);

}