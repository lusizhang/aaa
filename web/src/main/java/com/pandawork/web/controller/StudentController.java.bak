package com.pandawork.web.controller;

import com.pandawork.common.entity.Student;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.web.spring.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * description:StudentController
 *
 * @author: lusi
 * @time: 2015/8/26 16:57
 */

@Controller
@RequestMapping(value = "")
public class StudentController extends AbstractController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String toForm(Model model, @RequestParam("stuNum") int stuNum,
                         @RequestParam("pwd") String pwd) {
        try {
            if (studentService.checkLogin(stuNum, pwd)) {
                List<Student> list = Collections.emptyList();
                list = studentService.listall();
                model.addAttribute("form", list);
                return "form";
            } else {
                return "login";
            }
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public String toEdit(Model model) {
        return "edit";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String toUpdate(Model model, Student student) {
        try {
            studentService.update(student);
            List<Student> list = Collections.emptyList();
            list = studentService.listall();
            model.addAttribute("form", list);
            return "form";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String toDelete(Model model, @PathVariable("id") int id) {
        try {
            studentService.delById(id);
            return "/form";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String toAdd() {
        return "add";
    }

    @RequestMapping(value = "new", method = RequestMethod.GET)
    public String toNew(Student student) {
        try {
            studentService.newStudent(student);
            return "form";
        } catch (SSException e) {
            LogClerk.errLog.error(e);
            sendErrMsg(e.getMessage());
            return ADMIN_SYS_ERR_PAGE;
        }
    }

}


