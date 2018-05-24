package com.modificial.chapter6.controller;

import com.alibaba.fastjson.JSON;
import com.modificial.chapter6.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/7
 * Time：21:41
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping("/user")
@Api(value = "主页")
public class IndexController {

    /**
     * 初始化登录页面
     * @return
     */
    @RequestMapping(value = "/login_view",method = RequestMethod.GET)
    @ApiOperation(value = "登录",notes = "用户登录")
    public String login_view(){
        return "login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @ApiOperation(value = "主页",notes = "主页展示")
    public String index(){
        return "index";
    }
    @PostMapping("/upload")
    @ApiOperation(value = "上传文件",notes = "文件上传")
    public String  upload(MultipartFile multipartFile, String user) throws IOException {
        String name=multipartFile.getOriginalFilename();
        System.out.println(name);
        File file=new File("D:/"+name);
        multipartFile.transferTo(file);
        System.out.println(JSON.parseObject(user,User.class));
        return  file.getAbsolutePath();
    }
}
