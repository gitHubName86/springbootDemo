package com.fzp.controller;

import com.fzp.bean.SyUserBean;
import com.fzp.service.SyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private SyUserService syUserService;

    @RequestMapping("/index")
    public String index() {

        return "index";
    }

    @GetMapping(value = "/login")
    public String show(Model model) {
        model.addAttribute("user", new SyUserBean());
        return "login";
    }

    @PostMapping(value = "/loginIn")
    public String login(@ModelAttribute SyUserBean user) {
        SyUserBean syUserBean = syUserService.loginIn(user.getName(), user.getPassword());
        if (syUserBean != null) {
            return "login_sucess";
        } else {
            return "login_error";
        }
    }
}
