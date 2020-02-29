package com.example.myblog.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author lgd
 * @since 2019-12-31 00:10:58
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -41731756557284876L;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 用户id
    */
    private Integer userid;
public TUser(){
    super();
}


public TUser(    String username,
    String password,
    Integer userid
){
    super();
         this.username=username;
     this.password=password;
     this.userid=userid;
   
}



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}