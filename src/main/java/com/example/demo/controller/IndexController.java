package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.impl.ImpleLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qfcomputer on 2018/5/27.
 */

@Controller
public class IndexController {

    @Autowired
    ImpleLoginService impleLoginService;

    @RequestMapping("")
    public String  index(){
        return "index";
    }

/*    @RequestMapping("/company")
    public String  company(){
        return "company";
    }*/

    @RequestMapping("/loginResult")
    @ResponseBody
    public String home(HttpServletRequest request){
        String name=request.getParameter("name");
        String passwd=request.getParameter("passwd");
        User user=impleLoginService.loginResult(name,passwd);
        if(passwd.equals(user.getPasswd()))
            return "登录成功";
        else
            return "登录失败";
    }
}
