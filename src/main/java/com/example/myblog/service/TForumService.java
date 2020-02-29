package com.example.myblog.service;
import com.example.myblog.entity.TForum;
import com.example.myblog.dao.TForumDao; 
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TForum)表服务实现类
 *
 * @author makejava
 * @since 2019-12-31 16:21:36
 */
@Service("tForumService")
public class TForumService implements TForumDao {
   @Resource
     TForumDao tForumDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TForum queryById(Integer id) {
        return this.tForumDao.queryById(id);
    }

  

    /**
     * 新增数据
     *
     * @param tForum 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(TForum tForum) {
       return this.tForumDao.insert(tForum);
 
    }

    /**
     * 修改数据
     *
     * @param tForum 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TForum tForum) {
        return this.tForumDao.update(tForum);
    }

    @Override
    public List<TForum> queryNewTop(int forumtype) {
        return  this.tForumDao.queryNewTop(forumtype);
    }

    @Override
    public List<TForum> getforumbytype(int forumtype) {
        return  this.tForumDao.getforumbytype(forumtype);
    }
}