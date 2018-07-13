package cn.onloc.controller;

import cn.onloc.bean.User;
import cn.onloc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello.do", method = RequestMethod.GET)
    private String hello(Model model) {

        model.addAttribute("hello","word");
       return "hello";
    };

    @RequestMapping("/getUserByid.do")
    private String getUserById(Model model) {
        userService.getUserById(1);
        model.addAttribute("hello","word");
        return "hello";
    };

    @RequestMapping("/updateById.do")
    private String update(Model model) {
        userService.updateUserById(1);
        model.addAttribute("hello","word");
        return "hello";
    };

}
