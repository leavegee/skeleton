package com.bobanngame.blog.com.bobanngame.blog.config;

/**
 * Created by xuejia on 2017/5/5.
 */
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by wb-zhangkenan on 2016/12/1.
 */
@ControllerAdvice(basePackages = "com.bobanngame.blog.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice{

    public JsonpAdvice() {

        super("callback","jsonp");
    }
}