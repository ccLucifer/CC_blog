package com.cc.dao;

import com.cc.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author CC
 * @create 2020-07-15 14:35
 **/
public interface TagRepository extends JpaRepository<Tag, Long> {
    Tag findByName(String name);
}
