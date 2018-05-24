package com.modificial.lessontwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author modificial
 * @date 2018/4/8
 * @company codingApi
 * @description 控制器
 */
@Controller
public class IndexController {
    /**
     * 访问webapp/jsp/index.jsp文件
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
