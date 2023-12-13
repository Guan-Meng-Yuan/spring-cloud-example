package com.guanmengyuan.spring.cloud.example.consumer.controller;

import com.guanmengyuan.spring.cloud.example.model.domain.User;
import com.guanmengyuan.spring.cloud.example.api.UserApi;

import com.guanmengyuan.spring.ex.web.controller.BaseController;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User接口
 *
 * @author guanmengyuan
 */
@RestController
@RequestMapping("users")
public class UserController extends BaseController<UserApi, User> {

    @DubboReference
    private UserApi userApi;

    public UserController(UserApi service) {
        super(service);
    }
}

