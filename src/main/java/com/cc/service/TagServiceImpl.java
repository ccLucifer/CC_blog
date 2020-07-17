package com.cc.service;

import com.cc.NotFoundException;
import com.cc.dao.TagRepository;
import com.cc.po.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author CC
 * @create 2020-07-15 14:38
 **/
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.findOne(id);
    }

    @Transactional
    @Override
    public Tag getByName(String name) {
        return tagRepository.findByName(name);
    }

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        tagRepository.delete(id);
    }

    @Transactional
    @Override
    public Tag updateTag(Long id,Tag tag) {
        Tag t =tagRepository.findOne(id);
        if(t == null){
            throw new NotFoundException("not exits");
        }
        BeanUtils.copyProperties(tag,t);
        return tagRepository.save(t);
    }
}
