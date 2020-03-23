package com.softwarefirst.communitymannger.ssm.login.login.interceptor;


import com.softwarefirst.communitymannger.ssm.login.login.model.UserLogin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    // 拦截器忽略的url: 不拦截 "/login" 请求
    private static final String[] IGNORE_URI = { "/login" };
    // 该⽅法将在 Controller 处理前进⾏调⽤
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object o) throws Exception {
        // flag 表示是否登录
        boolean flag = false;
        // 获取请求的 URL
        String url = request.getServletPath();
        // 不拦截 "/login" 请求
        for (String s : IGNORE_URI) {
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            // 获取 Session 并判断是否登录
            UserLogin userLogin =
                    (UserLogin)request.getSession().getAttribute("USER_SESSION");
            if (userLogin == null) {
                request.setAttribute("message", "请先登录");
                // 如果未登录，进⾏拦截，跳转到登录⻚⾯
                request.getRequestDispatcher("/login")
                        .forward(request, response);
            } else {
                flag = true;
            }
        }
        return flag;
    }
    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {
    }
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}
