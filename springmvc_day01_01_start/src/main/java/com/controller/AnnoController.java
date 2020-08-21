package com.controller;

import com.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})  //把 msg=boston存入到session域对象中,用于参数共享
public class AnnoController {
    /**
     * ModelAttribute注解：
     *          作用：用于修饰方法和参数。可出现在方法或参数上
     *              当出现在方法上：
     *                      表示当前方法会在控制器的方法执行之前，先执行。--》优先执行
     *                      它可以修饰没有返回值的方法， -->参数需提供Map集合
     *                       也可以修饰有具体返回值的方法
     *              当出现在参数上：
     *                      表示获取指定的数据给参数赋值,根据key值获取
     *          属性：
     *              value：用于获取数据的key，key可以是POJO的属性名称，也可以是mao结构的key。
     *
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("User") User user){
        System.out.println("testModelAttribute执行了。。。");
        System.out.println(user);
        return "success";
    }

    /**
     * RequestParam注解
     *          属性：
     *              value 和 name 的作用是一样的
     *                  表明请求传入的参数key值，需要一致
     *              required:
     *                  默认值为true，表明请求传入的参数key值必须和  value 和 name 定义的key一致
     *
     *
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * RequestBody注解: 获取请求体的内容，一般用于表单post请求，get请求没有请求体，不适用。
     * <p>
     * 作用:用于获取请求体内容，得到的是key=value&key=value...结构数据。
     * 属性：
     *  required：
     *       默认值为true，表明必须有请求体，当取值为true时，get请求将报错，
     *       取值为false时，get请求得到的是null
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody(required = true) String body) {
        System.out.println("执行了。。。");
        System.out.println(body);
        return "success";
    }
    /**
     * PathVariable注解：
     *          作用:
     *              用于绑定url占位符
     *          属性：
     *              value：用于指定url中占位符名称
     *              required：是否必须提供占位符
     *          请求连接写法：
     *              地址 +/ 属性值
     */
    @RequestMapping("/testPathVariable/{uid}")
    public String testPathVariable(@PathVariable(value = "uid" ) Integer id){
        System.out.println(id);
        return "success";
    }
    /**
     * ModelAttribute 位于方法之上，有返回值
     * 该方法会先执行
     */
    //@ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser执行了。。");
        //通过用户名查询数据库信息（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }
    /**
     * ModelAttribute 位于方法之上，没有返回值
     * 该方法会先执行
     */
    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser执行了。。");
        //通过用户名查询数据库信息（模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("User",user);
    }
    /**
     * SessionAttributes注解： 只能作用于类上
     *          作用：
     *              用于多次执行控制器方法间的参数共享
     *          属性：
     *              value：用于指定存入的属性名称
     *              type：用于指定存入的数据类型
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes执行了。。。");
        //底层存储到request域对象中
        model.addAttribute("msg","boston");
        return "success";
    }

    /**
     * 从sesion域中获取值  model.getAttribute
     * @param model
     * @return
     */
    @RequestMapping("/testgetSessionValue")
    public String getSessionValue(Model model){
        System.out.println("getSessionValue执行了。。。");
        model.getAttribute("msg");
        return "success";
    }
    /**
     * 清除session域的值:
     *             方法参数使用SessionStatus 对象使用status.setComplete
     */
    @RequestMapping("/testdeleteSessionValue")
    public String deleteSessionValue(SessionStatus status){
        System.out.println("deleteSessionValue执行了。。。");
        status.setComplete();
        return "success";
    }
}
