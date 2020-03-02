package com.lc.gmall.user.controller;

import com.lc.gmall.user.poJo.UmsMember;
import com.lc.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LC on 2020/3/2 16:56
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getAllUser")
    public List<UmsMember> getAllUser() {
        List<UmsMember> allUser = this.userService.getAllUser();
        return allUser;
    }

    @GetMapping("{userId}")
    public UmsMember getUserById(@PathVariable("userId") String userId) {
        UmsMember umsMember = this.userService.getUserById(userId);
        return umsMember;
    }
}
