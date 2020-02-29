package com.example.myblog.service;
import com.example.myblog.entity.VForum;
import com.example.myblog.dao.VForumDao; 
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VForum)表服务实现类
 *
 * @author makejava
 * @since 2019-12-31 16:23:09
 */
@Service("vForumService")
public class VForumService implements VForumDao {
   @Resource
     VForumDao vForumDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    @Override
    public VForum queryById(Integer id ) {
        return this.vForumDao.queryById(id);
    }

    @Override
    public List<VForum> queryByForumType(Integer forumtype) {
        return this.vForumDao.queryByForumType(forumtype);
    }

    @Override
    public List<VForum> queryByTitleOrDescribe(String strWhere) {
        return this.vForumDao.queryByTitleOrDescribe(strWhere);
    }

}