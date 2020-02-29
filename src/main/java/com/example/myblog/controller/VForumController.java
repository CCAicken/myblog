package com.example.myblog.controller;

import com.alibaba.fastjson.JSON;
import com.example.myblog.entity.TForum;
import com.example.myblog.entity.VForum;
import com.example.myblog.service.VForumService;
import com.example.myblog.util.reJson;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VForum)表控制层
 *
 * @author makejava
 * @since 2019-12-31 16:23:09
 */
@RestController
@RequestMapping("vForum")
public class VForumController {
    /**
     * 服务对象
     */
    @Resource
    private VForumService vForumService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VForum selectOne( Integer id) {
        return this.vForumService.queryById(id);
    }
    /**
     *@Description: 根据文章类型id获取 文章
     *@Param: forumtype 文章类型id
     *@return: json字符串
     *@Author: lgd
     *@date: 2020/1/10
     */

    @RequestMapping(value = "queryforumbytype" ,method = RequestMethod.POST)
    public String getForumByType(int id){
        reJson  rejson=new reJson();
        List<VForum> list=this.vForumService.queryByForumType(id);
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
    *@Description: 根据文章标题或描述模糊查询文章
    *@Param: strWhere 标题或文章描述
    *@return: json字符串
    *@Author: lgd
    *@date: 2020/1/11
    */
    @RequestMapping(value = "queryforumbytitleordesc" ,method = RequestMethod.POST)
    public String queryByTitleOrDescribe(String strWhere){
        reJson  rejson=new reJson();
        if (StringUtils.isEmpty(strWhere)){
            rejson.code=1;
            rejson.msg="查询条件为空";
            rejson.data="";
            return JSON.toJSONString(rejson);
        }
        List<VForum> list=this.vForumService.queryByTitleOrDescribe(strWhere);
        if(list!=null){
            rejson.code=0;
            rejson.msg="查询成功";
            rejson.data=list;
            return JSON.toJSONString(rejson);
        };
        rejson.code=1;
        rejson.msg="查询失败";
        rejson.data="";
        return JSON.toJSONString(rejson);
    }
}