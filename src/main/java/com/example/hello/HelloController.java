package com.example.hello;

import com.example.hello.dto.TbMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/insert")
    public String insert(){
        return "insert";
    }
    @PostMapping("/insert_proc")
    @ResponseBody
    public String insert_proc(@ModelAttribute TbMenu tbMenu){
        System.out.println(tbMenu.getMenu());
        System.out.println(tbMenu.getPrice());
        System.out.println(tbMenu.getImg());
        return "데이터 전달";
    }
}


