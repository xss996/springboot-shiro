package com.joeshaw.demo.shirodemo.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.joeshaw.demo.shirodemo.pojo.User;
/**
*  @author joeshaw
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    int update(User.UpdateBuilder object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}