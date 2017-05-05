package com.bobanngame.blog.controller;


import com.bobanngame.blog.business.entity.Sample;
import com.bobanngame.blog.business.service.ISampleService;
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

    @Autowired
    ISampleService sampleService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {

        int result = accountService.add(a, b);

        Sample s = new Sample();
        s.setName(""+a+""+b+"=");
        s.setAge(result);

        sampleService.insert(s);

        return result;
    }

}