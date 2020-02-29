package com.example.myblog.dao;

import com.example.myblog.entity.TForumtype;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 * (TForumtype)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-31 20:13:47
 */
 @Repository
public interface TForumtypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param forumtype 主键
     * @return 实例对象
     */
    TForumtype queryById(Integer forumtype);
    /**
     *查询所有
     * @return 实例对象
     */
    List<TForumtype>  queryAll();

    /**
     * 查询前五
     * @return 前五数据
     */
    List <TForumtype> querytop5();
   

    /**
     * 新增数据
     *
     * @param tForumtype 实例对象
     * @return 影响行数
     */
    int insert(TForumtype tForumtype);

    /**
     * 修改数据
     *
     * @param tForumtype 实例对象
     * @return 影响行数
     */
    int update(TForumtype tForumtype);

   

}