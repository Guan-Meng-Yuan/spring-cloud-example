package com.guanmengyuan.spring.cloud.example.consumer.controller;

import com.guanmengyuan.spring.cloud.example.api.UserApi;
import com.guanmengyuan.spring.cloud.example.model.domain.User;
import com.mybatisflex.core.paginate.Page;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口文档
 */
@RestController
@RequestMapping("users")
public class UserController {

    @DubboReference
    private UserApi userApi;


    /**
     * 用户列表
     *
     * @return
     */
    @GetMapping
    public Page<User> users() {
        return userApi.page();
    }
}
