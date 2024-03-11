package com.guanmengyuan.spring.cloud.example.consumer.controller;

import com.guanmengyuan.spring.cloud.example.api.UserApi;
import com.guanmengyuan.spring.cloud.example.model.domain.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @DubboReference
    private UserApi userApi;

    @GetMapping
    public List<User> users() {
        return userApi.list();
    }
}
