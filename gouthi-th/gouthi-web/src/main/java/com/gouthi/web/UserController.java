package com.gouthi.web;

import com.gouthi.biz.service.UserService;
import com.gouthi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lu.Bing on 2017/2/28.
 * in com.gouthi.web
 * by Lu.Bing
 * on 2017/2/28
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    public List<User> find() {
        return userService.findAll();
    }

    @RequestMapping(value = "/")
    public String test() {
        return "this is just a test message!";
    }
}
