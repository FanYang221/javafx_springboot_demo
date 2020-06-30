package com.gauss.fxboot.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gauss.fxboot.demo.entity.User;
import com.gauss.fxboot.demo.transfer.LoginMsg;
import com.gauss.fxboot.demo.dao.UserMapper;
import com.gauss.fxboot.demo.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    public LoginMsg loginVerify(String account, String pwd) {
        LoginMsg msg = new LoginMsg();
        msg.setStatus(false);
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(pwd)){
            msg.setMessage("The account or password cannot be empty");
            return msg;
        }
        User user = this.getOne(new QueryWrapper<User>().eq("account", account));
        if(user == null){
            msg.setMessage("account is not exist");
            return msg;
        }
        if(user.getPassword().equals(pwd)){
            msg.setStatus(true);
            msg.setMessage("login success");
            return msg;
        }else {
            msg.setMessage("password error,please input again");
            return msg;
        }
    }
}
