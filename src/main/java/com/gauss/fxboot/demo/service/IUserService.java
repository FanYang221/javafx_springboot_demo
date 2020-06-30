package com.gauss.fxboot.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gauss.fxboot.demo.entity.User;
import com.gauss.fxboot.demo.transfer.LoginMsg;

public interface IUserService extends IService<User> {

    LoginMsg loginVerify(String account, String pwd);

}
