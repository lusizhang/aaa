package com.pandawork.mapper;

import com.pandawork.common.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:studentMapper
 * @author: mayuan
 * @time: 2015/8/19 9:15
 */
public interface StudentMapper {


    /**
     *统计符合输入的学号及密码的学生数量
     * @param studentNumber
     * @param password
     * @return
     * @throws Exception
     *
     */
    public Integer countByStuNumAndPwd(@Param("studentNumber") int studentNumber,
                                       @Param("password") String password) throws Exception;

    /**
     * 根据学号查询学生
     * @param studentNumber
     * @return
     * @throws Exception
     */
    public Student queryByStuNum(@Param("studentNumber") int studentNumber) throws Exception;

    /**
     *
     * @param student
     * @throws Exception
     */
    public void update(@Param("student") Student student) throws Exception;

    /**
     * 获取学生列表
     * @return
     * @throws Exception
     */
    public List<Student> listAll() throws Exception;

    /**
     * 根据id删除学生
     * @param id
     * @throws Exception
     */
    public void delById(@Param("id") int id) throws Exception;

    /**
     * 添加学生
     * @param student
     * @return
     * @throws Exception
     */
    public void newStudent(@Param("student") Student student) throws Exception;
}


