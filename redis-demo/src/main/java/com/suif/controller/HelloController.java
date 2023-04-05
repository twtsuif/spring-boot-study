package com.suif.controller;

import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @Resource
    RedisTemplate<String,String> redisTemplate;

    @GetMapping("hello")
    public String hello(){
        Boolean test = redisTemplate.hasKey("test");
        return String.valueOf(test);
    }
}
