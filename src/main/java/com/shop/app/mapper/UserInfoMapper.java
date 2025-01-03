package com.shop.app.mapper;

import com.shop.app.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/*
* ORM: data model UserInfo -> Table ms_userinfo
* */
@Mapper
public interface UserInfoMapper {
    @Select("SELECT id, username,password, create_time, update_time FROM ms_userinfo WHERE id = #{id}")
    UserInfo getUserInfoByUserId(Long id);
}
