package cn.smbms.controller;


import cn.smbms.beans.User;
import cn.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("index.html")
    public String login() {
        System.out.println("登录操作");
        return "index";
    }
}





