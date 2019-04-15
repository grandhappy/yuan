package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by qfcomputer on 2018/5/27.
 */
@Controller
public class ProductController {

    @RequestMapping("/product")
    public String  index(@RequestParam("index") String index){
        return "product/iron_"+index+".html";
    }

}
