package com.cc.service;

import com.cc.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author CC
 * @create 2020-07-15 14:38
 **/
public interface TagService {

    Tag saveTag(Tag tag);

    Tag getTag(Long id);

    Tag getByName(String name);

    Page<Tag> listTag(Pageable pageable);

    void delete(Long id);

    Tag updateTag(Long id,Tag tag);
}
