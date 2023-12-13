package com.guanmengyuan.spring.cloud.example.consumer.controller;

import com.guanmengyuan.spring.cloud.example.api.MenuApi;
import com.guanmengyuan.spring.cloud.example.model.domain.Menu;
import com.guanmengyuan.spring.ex.web.controller.BaseController;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜单表Menu接口
 *
 * @author guanmengyuan
 */
@RestController
@RequestMapping("menus")
public class MenuController extends BaseController<MenuApi, Menu> {

    @DubboReference
    private MenuApi menuApi;

    public MenuController(MenuApi service) {
        super(service);
    }
}

