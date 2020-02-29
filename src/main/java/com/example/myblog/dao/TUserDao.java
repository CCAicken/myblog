package com.example.myblog.dao;

import com.example.myblog.entity.TUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 * (TUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-31 00:10:58
 */
 @Repository
public interface TUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    TUser queryById(Integer userid);

   

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 影响行数
     */
    int insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 影响行数
     */
    int update(TUser tUser);

   

}