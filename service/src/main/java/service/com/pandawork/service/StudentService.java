package com.pandawork.service;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * description:UserService
 *
 * @author: lusi
 * @time: 2015/3/26 19:25
 */
public interface StudentService {

    /**
     * 判断登录
     * @param studentNumber
     * @param password
     * @return
     * @throws SSException
     */
    public boolean checkLogin(int studentNumber, String password) throws SSException;

    /**
     * 根据学号查询学生
     * @param studentNumber
     * @return
     * @throws SSException
     */
    public Student queryByStuNum(int studentNumber) throws SSException;

    /**
     * 更新
     * @param student
     * @throws SSException
     */
    public void update(Student student) throws SSException;

    /**
     * 返回学生列表
     * @return
     * @throws SSException
     */
    public List<Student> listall() throws SSException;

    /**
     * 根据id删除学生
     * @param id
     * @throws SSException
     */
    public void delById(int id) throws SSException;

    /**
     * 添加学生
     * @param student
     * @return
     * @throws SSException
     */
    public void newStudent(Student student) throws  SSException;
}
