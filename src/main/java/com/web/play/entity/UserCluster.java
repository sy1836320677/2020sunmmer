package com.web.play.entity;

import java.io.Serializable;

/**
 * (UserCluster)实体类
 *
 * @author makejava
 * @since 2020-07-11 17:01:35
 */
public class UserCluster implements Serializable {
    private static final long serialVersionUID = -47296335596620664L;
    
    private Integer userid;
    
    private Integer userclusterid;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserclusterid() {
        return userclusterid;
    }

    public void setUserclusterid(Integer userclusterid) {
        this.userclusterid = userclusterid;
    }

}