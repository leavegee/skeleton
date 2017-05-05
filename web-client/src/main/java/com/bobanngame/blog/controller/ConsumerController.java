package com.bobanngame.blog.controller;


import com.bobanngame.blog.business.entity.Sample;
import com.bobanngame.blog.business.service.ISampleService;
import com.bobanngame.blog.microservice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    int id = 1;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {

        int result = accountService.add(a, b);

        Sample s = new Sample();
        s.setName(""+a+"+"+b+"=");
        s.setAge(result);
        s.setId(id++);

        sampleService.insert(s);

        return result;
    }

    @RequestMapping(value = "/testJsonp",produces = MediaType.APPLICATION_JSON_VALUE)
    public Sample testJsonp(){
        Sample s = new Sample();
        s.setId(1);
        s.setAge(11);
        s.setName("hello世界");
        return s;
    }

}