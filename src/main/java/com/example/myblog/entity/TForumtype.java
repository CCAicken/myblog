package com.example.myblog.entity;

import java.io.Serializable;

/**
 * (TForumtype)实体类
 *
 * @author lgd
 * @since 2019-12-31 20:13:47
 */
public class TForumtype implements Serializable {
    private static final long serialVersionUID = 288832158004677282L;
    /**
    * 文章类型
    */
    private Integer forumtype;
    /**
    * 文章类型名称
    */
    private String forumtypename;
    /**
    * 描述
    */
    private String describe;
    /**
    * 类型图片
    */
    private String img;
public TForumtype(){
    super();
}


public TForumtype(    Integer forumtype,
    String forumtypename,
    String describe,
    String img
){
    super();
         this.forumtype=forumtype;
     this.forumtypename=forumtypename;
     this.describe=describe;
     this.img=img;
   
}



    public Integer getForumtype() {
        return forumtype;
    }

    public void setForumtype(Integer forumtype) {
        this.forumtype = forumtype;
    }

    public String getForumtypename() {
        return forumtypename;
    }

    public void setForumtypename(String forumtypename) {
        this.forumtypename = forumtypename;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}