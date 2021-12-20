package com.spring.session.data.redis.demo.controller;

import com.spring.session.data.redis.demo.util.SessionUtil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author turman
 * @date 2021/12/20 14:37
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/setValue")
    public void setValue() {
        SessionUtil.getSession().setAttribute("demo", "test1");
    }

    @GetMapping("/getValue")
    public String getValue() {
        return (String) SessionUtil.getSession().getAttribute("demo");
    }
}
