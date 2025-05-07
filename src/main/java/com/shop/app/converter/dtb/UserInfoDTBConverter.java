package com.shop.app.converter.dtb;

import com.google.common.base.Converter;
import com.shop.app.model.dao.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserInfoDTBConverter extends Converter<UserInfo, com.shop.app.model.bo.UserInfo> {
    @Override
    protected com.shop.app.model.bo.UserInfo doForward(UserInfo userInfo) {
        return com.shop.app.model.bo.UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }

    @Override
    protected UserInfo doBackward(com.shop.app.model.bo.UserInfo userInfo) {
        return UserInfo.builder()
                .id(userInfo.getId())
                .username(userInfo.getUsername())
                .password(userInfo.getPassword())
                .build();
    }
}
