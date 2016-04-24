package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * description:Student实体类
 * @author:lusi
 * @Date:2016/4/17.
 */

@Table(name = "t_student")
@Entity
public class Student extends AbstractEntity {
    //学生表主键id
    @Id
    private Integer id;

    //学生学号
    @Column(name = "student_num")
    private Integer studentNumber;

    //学生姓名
    @Column(name = "name")
    private String studentName;

    //学生性别
    @Column(name = "sex")
    private String sex;

    //学生年级
    @Column(name = "grade")
    private Integer grade;

    //学生班级
    @Column(name = "class_num")
    private Integer classNumber;

    //学生学院
    @Column(name = "college")
    @Enumerated(EnumType.STRING)
    private Integer college;

    //学生出生日期
    @Column(name = "birthday")
    private Date birthday;

    //是否好学生
    @Column(name = "is_good_student")
    private String isGoodStudent;

    //学生登录密码
    @Column(name="password")
    private String password;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public  Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIsGoodStudent() {
        return isGoodStudent;
    }

    public void setIsGoodStudent(String isGoodStudent) {
        this.isGoodStudent = isGoodStudent;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}