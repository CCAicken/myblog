package com.example.myblog.util;

/**
 * @description: 请求返回的json数据
 * @author: lgd
 * @create: 2020-01-08 22:44
 */
public class reJson {
    public static int SUCCESS = 0;
    public static int ERRR = 1;

    public int code;
    public String msg;
    public int count;
    public Object data;
    public Object data1;
    public String result;
    public String result2;

    public reJson(int code, String msg, int count, Object data, Object data1) {
        super();
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
        this.data1 = data1;
    }

    public reJson(int code, String msg, int count, Object data,
                     String result, String result2, Object data1) {
        super();
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
        this.result = result;
        this.result2 = result2;
        this.data1 = data1;
    }

    public reJson() {
        super();
        // TODO Auto-generated constructor stub
    }
}

