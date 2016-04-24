package com.pandawork.service;

import com.pandawork.common.entity.User;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 *description:UserService
 *
 * @author:lusi
 * @time: 2015/3/26 19:25
 */
public interface UserService {

    /**
     * 添加用户
     * @param user
     * @throws SSException
     */
    public void newUser( User user) throws SSException;

    /**
     * 更新
     * @param user
     * @throws SSException
     */
    public void update( User user) throws SSException;

    /**
     * 删除用户
     * @param id
     * @throws SSException
     */
    public void deleteById( int id) throws SSException;

    /**
     * 返回用户列表
     * @return
     * @throws SSException
     */
    public List<User> listAll() throws SSException;

    /**
     * 根据id查询用户
     * @param id
     * @return
     * @throws SSException
     */
    public User queryById( int id) throws SSException;

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     * @throws SSException
     */
    public User queryByUserName( String userName) throws SSException;

    /**
     * 判断用户登录
     * @param user
     * @return
     * @throws SSException
     */
    public boolean checkLogin(User user) throws SSException;

    /**
     * 判断用户名是否存在
     * @param name
     * @return
     * @throws SSException
     */
    public boolean checkUserName(String name) throws SSException;
}
