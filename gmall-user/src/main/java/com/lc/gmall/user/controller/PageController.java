package com.lc.gmall.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LC on 2020/3/2 17:16
 */
@Controller
@RequestMapping("page")
public class PageController {
    @GetMapping("{pageName}")
    public String toPage(@PathVariable("pageName") String pageName){
        return pageName;
    }

}
