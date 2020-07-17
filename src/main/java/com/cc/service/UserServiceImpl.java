package com.cc.service;

import com.cc.utils.MD5Utils;
import com.cc.dao.UserRepository;
import com.cc.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CC
 * @create 2020-07-02 11:51
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password){
        User user =userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

}
