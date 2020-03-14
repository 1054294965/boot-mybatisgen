package com.example;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Watchable;
import java.util.HashMap;
import java.util.Random;

@Controller
class IndexController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello pillar");
        return "index";
    }

    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<String,String>();
        map.put("asdf","asfasf");

        System.out.println(JSON.toJSONString(map));
    }

}
