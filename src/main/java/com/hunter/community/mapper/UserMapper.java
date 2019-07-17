package com.hunter.community.mapper;

import com.hunter.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Hunter on 7/17/2019
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
