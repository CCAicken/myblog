package com.example.myblog.entity;

import java.io.Serializable;

/**
 * (VForum)实体类
 *
 * @author lgd
 * @since 2020-01-11 14:41:09
 */
public class VForum implements Serializable {
    private static final long serialVersionUID = -10421058283829340L;
    /**
    * 文章标题
    */
    private String title;
    /**
    * id
    */
    private Integer id;
    /**
    * 作者
    */
    private Integer userid;
    /**
    * .md格式
    */
    private String mdtext;
    /**
    * 创建时间
    */
    private String createtime;
    /**
    * 文章描述
    */
    private String forumdescribe;
    /**
    * html 文本
    */
    private String htmltext;
    /**
    * 文章类型名称
    */
    private String forumtypename;
    /**
    * 用户名
    */
    private String username;
    /**
    * 类型图片
    */
    private String img;
    /**
    * 文章类型
    */
    private Integer forumtype;
public VForum(){
    super();
}


public VForum(    String title,
    Integer id,
    Integer userid,
    String mdtext,
    String createtime,
    String forumdescribe,
    String htmltext,
    String forumtypename,
    String username,
    String img,
    Integer forumtype
){
    super();
         this.title=title;
     this.id=id;
     this.userid=userid;
     this.mdtext=mdtext;
     this.createtime=createtime;
     this.forumdescribe=forumdescribe;
     this.htmltext=htmltext;
     this.forumtypename=forumtypename;
     this.username=username;
     this.img=img;
     this.forumtype=forumtype;
   
}



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMdtext() {
        return mdtext;
    }

    public void setMdtext(String mdtext) {
        this.mdtext = mdtext;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getForumdescribe() {
        return forumdescribe;
    }

    public void setForumdescribe(String forumdescribe) {
        this.forumdescribe = forumdescribe;
    }

    public String getHtmltext() {
        return htmltext;
    }

    public void setHtmltext(String htmltext) {
        this.htmltext = htmltext;
    }

    public String getForumtypename() {
        return forumtypename;
    }

    public void setForumtypename(String forumtypename) {
        this.forumtypename = forumtypename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getForumtype() {
        return forumtype;
    }

    public void setForumtype(Integer forumtype) {
        this.forumtype = forumtype;
    }

}