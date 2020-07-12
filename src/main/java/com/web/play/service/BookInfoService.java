package com.web.play.service;

import com.web.play.entity.BookInfo;
import com.web.play.entity.Rebang;

import java.util.List;
import java.util.Map;

/**
 * (BookInfo)表服务接口
 *
 * @author makejava
 * @since 2020-07-10 11:18:23
 */
public interface BookInfoService {

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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BookInfo> queryAllByLimit(int offset, int limit);


    /**
     * 新增数据
     *
     * @param bookInfo 实例对象
     * @return 实例对象
     */
    BookInfo insert(BookInfo bookInfo);

    /**
     * 修改数据
     *
     * @param bookInfo 实例对象
     * @return 实例对象
     */
    BookInfo update(BookInfo bookInfo);

    /**
     * 通过主键删除数据
     *
     * @param bookId 主键
     * @return 是否成功
     */
    boolean deleteById(Long bookId);

}