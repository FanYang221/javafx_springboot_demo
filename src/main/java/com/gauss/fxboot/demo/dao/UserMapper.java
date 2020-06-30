package com.gauss.fxboot.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gauss.fxboot.demo.entity.User;

public interface UserMapper extends BaseMapper<User> {

    Integer selectUserCount();

}
