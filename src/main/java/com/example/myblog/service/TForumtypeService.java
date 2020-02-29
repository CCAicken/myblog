package com.example.myblog.service;
import com.example.myblog.entity.TForumtype;
import com.example.myblog.dao.TForumtypeDao; 
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TForumtype)表服务实现类
 *
 * @author makejava
 * @since 2019-12-31 20:13:47
 */
@Service("tForumtypeService")
public class TForumtypeService implements TForumtypeDao {
   @Resource
     TForumtypeDao tForumtypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param forumtype 主键
     * @return 实例对象
     */
    @Override
    public TForumtype queryById(Integer forumtype) {
        return this.tForumtypeDao.queryById(forumtype);
    }

    @Override
    public List<TForumtype> queryAll() {
        return this.tForumtypeDao.queryAll();
    }

    @Override
    public List<TForumtype> querytop5() {
        return  this.tForumtypeDao.querytop5();
    }


    /**
     * 新增数据
     *
     * @param tForumtype 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(TForumtype tForumtype) {
       return this.tForumtypeDao.insert(tForumtype);
 
    }

    /**
     * 修改数据
     *
     * @param tForumtype 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TForumtype tForumtype) {
        return this.tForumtypeDao.update(tForumtype);
    }
}