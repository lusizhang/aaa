package test;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.service.StudentService;
import org.jdom2.output.support.SAXOutputProcessor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * StudentServiceTest
 *
 * @author: mayuan
 * @time: 2015/8/24 20:02
 */
public class StudentServiceTest extends AbstractTestCase {

    @Autowired
    private StudentService studentService;


    @Test
    public void checkLogin() throws SSException {
        Student student = new Student();
        student.setStudentNumber(2014012172);
        student.setPassword("123456");
        if (studentService.checkLogin(student.getStudentNumber(), student.getPassword())) {
            System.out.print("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }

    @Test
    public void queryByStudentNumber() throws SSException {
        Student student = new Student();
        student.setStudentNumber(2014012172);
        System.out.println(studentService.queryByStuNum(student.getStudentNumber()));
    }

    @Test
    public void update() throws SSException {
        Student student = new Student();
        student.setStudentNumber(2013012680);
        student.setStudentName("lisi");
        student.setSex("1");
        student.setGrade(6);
        student.setClassNumber(6);
        student.setCollege(6);
        student.setIsGoodStudent("0");
        student.setPassword("6666");
        student.setId(1);
        studentService.update(student);
        System.out.println("更新成功！");
    }

    @Test
    public void listall() throws SSException {
        System.out.println(studentService.listall());
    }

    @Test
    public void delById() throws SSException {
        studentService.delById(1);
        System.out.println("删除成功~");
    }

    @Test
    public void newStudent() throws SSException {
        Student student = new Student();
        student.setId(1);
        student.setStudentNumber(2013012680);
        student.setStudentName("lisi");
        student.setSex("1");
        student.setGrade(6);
        student.setClassNumber(6);
        student.setCollege(6);
        student.setBirthday(null);
        student.setIsGoodStudent("0");
        student.setPassword("6666");
        studentService.newStudent(student);
    }
}
