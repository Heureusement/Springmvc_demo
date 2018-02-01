package com.hellocc.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String json(HttpServletRequest request) {
        HashMap<String, Object> responseBody = new HashMap<String, Object>();
        responseBody.put("code", 200);
        responseBody.put("message", "Create success.");
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }
}