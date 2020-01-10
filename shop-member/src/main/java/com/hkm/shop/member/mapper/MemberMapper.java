package com.hkm.shop.member.mapper;

import com.hkm.shop.member.bean.Member;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;


@Mapper
public interface MemberMapper {

    @Results(id="member",value={
        @Result(column = "id",property = "id"),
        @Result(column = "username",property = "username"),
        @Result(column = "password",property = "password"),
        @Result(column = "salt",property = "salt"),
        @Result(column = "nickname",property = "nickname"),
        @Result(column = "phone",property = "phone"),
        @Result(column = "status",property = "status"),
        @Result(column = "create_time",property = "createTime"),
        @Result(column = "icon",property = "icon"),
        @Result(column = "gender",property = "gender")
    })
    @Select("select * from ums_member")
    List<Member> selectMembers();
}
