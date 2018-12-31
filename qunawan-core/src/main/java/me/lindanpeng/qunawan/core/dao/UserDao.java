package me.lindanpeng.qunawan.core.dao;

import me.lindanpeng.qunawan.core.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from User where id=#{id}")
    User selectOne(Long id);
}
