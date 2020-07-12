package com.web.play.dao;

import com.web.play.entity.BookInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (BookInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 11:18:23
 */
public interface BookInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bookId 主键
     * @return 实例对象
     */
    BookInfo queryById(Long bookId);
    List <BookInfo> queryByCateId(int cateId);
    BookInfo queryByName(String name);
    List <Object> queryByCname(String cname);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param bookInfo 实例对象
     * @return 对象列表
     */
    List<BookInfo> queryAll(BookInfo bookInfo);

    /**
     * 新增数据
     *
     * @param bookInfo 实例对象
     * @return 影响行数
     */
    int insert(BookInfo bookInfo);

    /**
     * 修改数据
     *
     * @param bookInfo 实例对象
     * @return 影响行数
     */
    int update(BookInfo bookInfo);

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 影响行数
     */
    int deleteById(Long bookId);

}