package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:MyController
 * Package: com.mytest.controller
 * Description:
 *
 * @Date: 2021/5/12 20:56
 * @Author: 惜名
 */
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.setViewName("student");


        return mv;
    }
    @RequestMapping(value = "/addStudent.do" ,method = RequestMethod.POST)
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.setViewName("hello");
        return mv;
    }
}
