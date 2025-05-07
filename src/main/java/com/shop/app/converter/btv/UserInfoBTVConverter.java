package com.shop.app.converter.btv;

import com.google.common.base.Converter;
import com.shop.app.model.bo.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserInfoBTVConverter extends Converter<UserInfo, com.shop.app.model.vo.UserInfo> {
    @Override
    protected com.shop.app.model.vo.UserInfo doForward(UserInfo userInfo) {
        return com.shop.app.model.vo.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();
    }

    @Override
    protected UserInfo doBackward(com.shop.app.model.vo.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .build();
    }
}
