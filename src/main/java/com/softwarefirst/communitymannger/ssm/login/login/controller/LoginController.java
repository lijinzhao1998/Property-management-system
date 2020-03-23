package com.softwarefirst.communitymannger.ssm.login.login.controller;


import com.softwarefirst.communitymannger.ssm.login.login.model.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /**
     * 跳转到⽤户登录⻚⾯/jsp/login.jsp
     */
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String toLogin() {
        return "/login";
    }
    /**
     * ⽤户登录，只处理⽤POST⽅法的提交
     */

    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String login(UserLogin user, Model model, HttpSession session) {
        // 获取⽤户名和密码
        String userLoginId = user.getUserLoginId();
        String password = user.getCurrentPassword();
        // TODO:从数据库进⾏验证
        // 此处模拟从数据库中获取⽤户名和密码后进⾏判断
        if(userLoginId != null && userLoginId.equals("admin")
                && password != null && password.equals("123456")){
            // 登录成功，将⽤户对象添加到Session
            session.setAttribute("USER_SESSION", user);
            // 重定向到主⻚
            return "redirect:home";
        }
        model.addAttribute("message", "⽤户名或密码错误");
        return "/login";
    }
    /**
     * 跳转到主⻚⾯/jsp/home.jsp
     */
    @RequestMapping("/home")
    public String toHome() {
        return "/home";
    }
    /**
     * 退出登录
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向到登录⻚⾯
        return "/login";
    }
}
