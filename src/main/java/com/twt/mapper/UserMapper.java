package com.twt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.twt.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<String> getUserRoles(Long userId);
}
