package com.cc.dao;

import com.cc.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author CC
 * @create 2020-07-02 11:54
 **/
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);

}
