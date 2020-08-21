package com.controller;

import com.domain.Account;
import com.domain.Account2;
import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("执行了..." + username + "  " + password);
        return "success";
    }

    /**
     * 请求参数绑定把数据封装到javabean类中
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
            System.out.println("执行了...");
            System.out.println(account);
            System.out.println(account.getUser());
            return "success";
        }

    @RequestMapping("/saveAccount2")
    public String saveAccount(Account2 account2) {
        System.out.println("执行了...");
        System.out.println(account2);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveAccount(User user) {
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     * 获取原生ServletAPI
     * @param
     * @return
     */
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了...");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }
}
