package com.example.myblog.controller;

import com.alibaba.fastjson.JSON;
import com.example.myblog.entity.TForum;
import com.example.myblog.service.TForumService;
import com.example.myblog.util.objtools;
import com.example.myblog.util.reJson;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TForum)表控制层
 *
 * @author makejava
 * @since 2019-12-31 16:21:36
 */
@RestController
@RequestMapping("tForum")
public class TForumController {
    /**
     * 服务对象
     */
    @Resource
    private TForumService tForumService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TForum selectOne(Integer id) {
        return this.tForumService.queryById(id);
    }

    /**
     * 添加文章
     * @param tForum
     * @return rejson json 字符串
     */
    @PostMapping("addTForum")
    @ResponseBody
    public String addTForum(TForum tForum){
        reJson  rejson=new reJson();
        if(objtools.objIsNull(tForum,new String[]{"title", "userid", "mdtext","forumtype","forumdescribe","htmltext"})){
            rejson.code=1;
            rejson.msg="添加失败";
            return JSON.toJSONString(rejson);
        }
        if(this.tForumService.insert(tForum)>0){
            rejson.code=0;
            rejson.msg="添加成功";
            return JSON.toJSONString(rejson);
        };
        rejson.code=1;
        rejson.msg="添加失败";
        return JSON.toJSONString(rejson);
    }
    /**
    *@Description: 根据文章类型id获取最新十五篇文章
    *@Param: forumtype 文章类型id
    *@return: json字符串
    *@Author: lgd
    *@date: 2020/1/10
    */

    @RequestMapping(value = "querynewtop" ,method = RequestMethod.POST)
    public String queryNewTop(int id){
        reJson  rejson=new reJson();
        List<TForum> list=this.tForumService.queryNewTop(id);
        if(list!=null){
            rejson.code=0;
            rejson.msg="查询成功";
            rejson.data=list;
            return JSON.toJSONString(rejson);
        };
        rejson.code=1;
        rejson.msg="查询失败";
        return JSON.toJSONString(rejson);
    }
    /**
     *@Description: 根据文章类型id获取最新十五篇文章
     *@Param: forumtype 文章类型id
     *@return: json字符串
     *@Author: lgd
     *@date: 2020/1/10
     */

    @RequestMapping(value = "queryforumbytype" ,method = RequestMethod.POST)
    public String getForumByType(int id){
        reJson  rejson=new reJson();
        List<TForum> list=this.tForumService.getforumbytype(id);
        if(list!=null){
            rejson.code=0;
            rejson.msg="查询成功";
            rejson.data=list;
            return JSON.toJSONString(rejson);
        };
        rejson.code=1;
        rejson.msg="查询失败";
        return JSON.toJSONString(rejson);
    }

}