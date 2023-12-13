package com.guanmengyuan.spring.cloud.example.provider.service;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.guanmengyuan.spring.cloud.example.model.domain.User;
import com.guanmengyuan.spring.cloud.example.provider.mapper.UserMapper;
import com.guanmengyuan.spring.cloud.example.api.UserApi;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * User表服务实现类
 *
 * @author guanmengyuan
 */
@DubboService
public class UserService extends ServiceImpl<UserMapper, User> implements UserApi {

}

