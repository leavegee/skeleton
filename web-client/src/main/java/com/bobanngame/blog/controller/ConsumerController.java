package com.bobanngame.blog.controller;


import com.bobanngame.blog.microservice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuejia on 2017/5/1.
 */
@RestController
public class ConsumerController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return accountService.add(a, b);
    }

}