package com.alvin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Alvinyau on 2015/9/14.
 */
@Controller
@RequestMapping("/tree")
public class TreeController {

    @ResponseBody
    @RequestMapping(value = "getChildNodes",method = RequestMethod.POST)
    public void getChildNodes(@RequestParam String id,String name){
        System.out.println("tree id "+id+" name "+name);
    }
}
