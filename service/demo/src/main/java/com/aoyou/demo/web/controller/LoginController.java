package com.aoyou.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping("/user/login") //默认方式method = get
    public String login(@RequestParam String userName, @RequestParam String passWord, Model model) {
        if (userName.equals("admin") && passWord.equals("123456")) {
            return "gameIndex";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "userLogin";
        }

    }
}
