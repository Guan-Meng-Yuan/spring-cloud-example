package com.guanmengyuan.spring.cloud.example.provider.service;

import com.guanmengyuan.spring.cloud.example.api.UserApi;
import com.guanmengyuan.spring.cloud.example.model.domain.User;
import com.guanmengyuan.spring.cloud.example.provider.mapper.UserMapper;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@RequiredArgsConstructor
public class UserService extends ServiceImpl<UserMapper, User> implements UserApi {
    private final UserMapper userMapper;

    @Override
    public Page<User> page() {
        return page(Page.of(1, 10), User.create().where(User::getId).eq("1").toQueryWrapper());
    }
}
