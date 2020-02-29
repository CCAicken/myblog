package com.example.myblog.controller;

import com.example.myblog.entity.TForumtype;
import com.example.myblog.service.TForumtypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TForumtype)表控制层
 *
 * @author makejava
 * @since 2019-12-31 20:13:47
 */
@CrossOrigin
@RestController
@RequestMapping("tForumtype")
public class TForumtypeController {
    /**
     * 服务对象
     */
    @Resource
    private TForumtypeService tForumtypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TForumtype selectOne(Integer id) {
        return this.tForumtypeService.queryById(id);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @PostMapping("selectall")
    public List<TForumtype> selectAll(Integer id) {
        return this.tForumtypeService.queryAll();
    }

    @PostMapping("selecttop5")
    public List<TForumtype> selecttop5() {
        return this.tForumtypeService.querytop5();
    }

}