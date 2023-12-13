package com.guanmengyuan.spring.cloud.example.provider.service;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.guanmengyuan.spring.cloud.example.model.domain.Menu;
import com.guanmengyuan.spring.cloud.example.provider.mapper.MenuMapper;
import com.guanmengyuan.spring.cloud.example.api.MenuApi;
import org.springframework.stereotype.Service;

/**
 * 菜单表Menu表服务实现类
 *
 * @author guanmengyuan
 */
@Service
public class MenuService extends ServiceImpl<MenuMapper, Menu> implements MenuApi {

}

