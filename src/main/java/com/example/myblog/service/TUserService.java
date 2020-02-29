package com.example.myblog.service;

import com.example.myblog.entity.TUser;
import com.example.myblog.dao.TUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表服务实现类
 *
 * @author makejava
 * @since 2019-12-31 00:10:58
 */
@Service("tUserService")
public class TUserService implements TUserDao {


    @Resource
     TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(Integer userid) {
        return this.tUserDao.queryById(userid);
    }

  

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(TUser tUser) {
       return this.tUserDao.insert(tUser);
 
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TUser tUser) {
        return this.tUserDao.update(tUser);
    }
}