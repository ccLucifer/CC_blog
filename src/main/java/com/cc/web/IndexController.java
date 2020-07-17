package com.cc.web;

import com.cc.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CC
 * @create 2020-06-13 18:21
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i =9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new NotFoundException("博客找不着");
//        }
System.out.println("----------Index----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

}
