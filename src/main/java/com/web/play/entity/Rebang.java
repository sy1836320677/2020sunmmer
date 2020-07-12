package com.web.play.entity;

import java.io.Serializable;

/**
 * (Rebang)实体类
 *
 * @author makejava
 * @since 2020-07-12 16:14:12
 */
public class Rebang implements Serializable {
    private static final long serialVersionUID = 578195820311911918L;

    private Long bookId;

    private Integer count;


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}