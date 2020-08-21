package com.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类 ,接收jsp页面请求
 */
@Controller("helloController")
@RequestMapping(path = "/user")
public class HelloController {
    @RequestMapping(value = "/hello")
    public String sayHello(){
        System.out.println("hello springMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     *          value和 path 作用效果是一样的，用于指定调用方法的路径
     *          method:
     *              用于指定请求方式
     *
     *          params：  少用
     *              用于指定请求参数的条件，要求请求参数的key和value必须和配置一模一样。它支持简单的表达式
     *          headers:  少用
     *              发送的请求中必须包含的请求头
     *              用于指定限制请求消息头的条件
     * @return
     */
    @RequestMapping(value = "/testRequestMapping",params = {"username"},headers = "Accept")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解。。。");
        return "success";
    }
}
