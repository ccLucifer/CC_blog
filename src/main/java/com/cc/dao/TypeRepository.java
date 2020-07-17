package com.cc.dao;

import com.cc.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author CC
 * @create 2020-07-14 10:59
 **/
public interface TypeRepository extends JpaRepository<Type,Long> {
    Type findByName(String name);
}
