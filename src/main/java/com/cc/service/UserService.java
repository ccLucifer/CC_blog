package com.cc.service;

import com.cc.po.User;

/**
 * @author CC
 * @create 2020-07-02 11:49
 **/
public interface UserService {
    User checkUser(String username, String passwprd);
}
