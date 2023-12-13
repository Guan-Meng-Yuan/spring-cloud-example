package com.guanmengyuan.spring.cloud.example.model.domain;

import com.guanmengyuan.spring.ex.common.model.domain.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * User实体类
 *
 * @author guanmengyuan
 */
@Accessors(chain = true)
@Data(staticConstructor = "create")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseDomain<User> {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}

