package com.example.myblog.dao;

import com.example.myblog.entity.TForum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 * (TForum)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-31 16:21:36
 */
 @Repository
 @Mapper
public interface TForumDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TForum queryById(Integer id);

   

    /**
     * 新增数据
     *
     * @param tForum 实例对象
     * @return 影响行数
     */
    int insert(TForum tForum);

    /**
     * 修改数据
     *
     * @param tForum 实例对象
     * @return 影响行数
     */
    int update(TForum tForum);

  /**
  *@Description: 根据文章类型获取该类型最新的15篇文章
  *@Param: forumtype 文章类型
  *@return: 文章类型数据集
  *@Author: lgd
  *@date: 2020/1/10
  */
    List<TForum> queryNewTop(int forumtype);

    /**
     * 根据文章类型获取文章
     * @param forumtype
     * @return
     */
   List<TForum> getforumbytype(int forumtype);

}