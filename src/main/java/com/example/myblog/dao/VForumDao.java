package com.example.myblog.dao;

import com.example.myblog.entity.VForum;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 * (VForum)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-31 16:23:09
 */
 @Repository
public interface VForumDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VForum queryById(Integer id);

    /**
     * 根据文章类型查询文章
     * @param forumtype
     * @return
     */
    List<VForum> queryByForumType(Integer forumtype);

    List<VForum> queryByTitleOrDescribe (String strWhere);
}