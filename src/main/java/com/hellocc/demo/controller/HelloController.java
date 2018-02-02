package com.hellocc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dongyu
 * @create 2018-02-02
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/hello")
public class HelloController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        //返回一个index.jsp这个视图
        return "index";
    }
}