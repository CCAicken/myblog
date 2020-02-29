package com.example.myblog.entity;


import org.springframework.data.relational.core.mapping.Column;

import java.io.Serializable;

/**
 * (TForum)实体类
 *
 * @author lgd
 * @since 2019-12-31 16:21:36
 */
public class TForum implements Serializable {
    private static final long serialVersionUID = 526839760743083775L;
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
     * 文章类型
     */
    private Integer forumtype;
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

    public TForum() {
        super();
    }


    public TForum(
            String title,
            Integer id,
            Integer userid,
            String mdtext,
            Integer forumtype,
            String createtime,
            String forumdescribe,
            String htmltext
    ) {
        super();
        this.title = title;
        this.id = id;
        this.userid = userid;
        this.mdtext = mdtext;
        this.forumtype = forumtype;
        this.createtime = createtime;
        this.forumdescribe = forumdescribe;
        this.htmltext = htmltext;

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

    public Integer getForumtype() {
        return forumtype;
    }

    public void setForumtype(Integer forumtype) {
        this.forumtype = forumtype;
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

}