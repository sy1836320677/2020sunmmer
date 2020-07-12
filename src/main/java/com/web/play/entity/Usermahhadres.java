package com.web.play.entity;

import java.io.Serializable;

/**
 * (Usermahhadres)实体类
 *
 * @author makejava
 * @since 2020-07-11 17:02:05
 */
public class Usermahhadres implements Serializable {
    private static final long serialVersionUID = 900409819468783484L;
    
    private Integer userid;
    
    private String userrecommend;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserrecommend() {
        return userrecommend;
    }

    public void setUserrecommend(String userrecommend) {
        this.userrecommend = userrecommend;
    }

}