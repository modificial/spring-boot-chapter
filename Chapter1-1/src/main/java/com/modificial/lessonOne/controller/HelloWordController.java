package com.modificial.lessonOne.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author modificial
 * @date 2018/4/8
 * @company codingApi
 * @description 控制器
 */
@RestController
@RequestMapping
public class HelloWordController {
    /**
     * 测试输出HelloWord
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "HelloWord";
    }
}
