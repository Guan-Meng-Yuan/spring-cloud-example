package com.guanmengyuan.spring.cloud.example.model.domain;

import com.guanmengyuan.spring.ex.common.model.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 菜单表Menu实体类
 *
 * @author guanmengyuan
 */
@Accessors(chain = true)
@Data(staticConstructor = "create")
@EqualsAndHashCode(callSuper = true)
public class Menu extends BaseDomain<Menu> {

    /**
     * 菜单名称
     */
    private String name;

}

