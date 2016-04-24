package com.pandawork.service.impl;

import com.pandawork.common.entity.Student;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.StudentMapper;
import com.pandawork.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * StudentServiceImpl
 * Created by chant on 2016/3/23.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    @Qualifier("commonDao")//commDao别名
    protected CommonDao commonDao;

    @Override
    public boolean checkLogin(int studentNumber, String password) throws SSException {
            if (Assert.isNull(studentNumber ) || Assert.isNull(password)) {
                return false;
            }
            try {
                return studentMapper.countByStuNumAndPwd(studentNumber, password) == 1?true:false;
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.SystemException, e);
            }
        }

    @Override
    public Student queryByStuNum(int studentNumber) throws SSException {
            if (Assert.isNull(studentNumber)) {
                return null;
            }
            try {
                return studentMapper.queryByStuNum(studentNumber);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.SystemException, e);
        }
}

    @Override
    public void update(Student student) throws SSException {
            if(Assert.isNull(student)) {
                return ;
            }
            try {
                studentMapper.update(student);
            } catch(Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.SystemException, e);
            }
        }

    @Override
    public List<Student> listall() throws SSException {
        try {
            return studentMapper.listAll();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public void delById(int id) throws SSException {
        if(Assert.lessOrEqualZero(id)) {
            return ;
        }
        try {
            studentMapper.delById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public void newStudent(Student student) throws SSException {
        if(Assert.isNull(student)) {
            return ;
        }
        try {
            studentMapper.newStudent(student);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }
}


