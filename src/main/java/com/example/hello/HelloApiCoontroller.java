package com.example.hello;

import com.example.hello.dto.TbMenu;
import com.example.hello.repo.MenuRepository;
import com.example.hello.service.MenuService;
import com.example.hello.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HelloApiCoontroller {

    @Autowired
    private MenuService menuService;
    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/hellokr")
    String hello() {
        return "헬로 월드!";
    }


    //@PostMapping("/insert")
    //public ResponseEntity<MenuVo> save(MenuVo menu) {
    //    return new ResponseEntity<MenuVo>(menuService.save(menu), HttpStatus.OK);
    //}
    @PostMapping("/api/v1/insert")
    public Long save(@RequestBody MenuVo menu){
        return menuService.save(menu);
    }
    @Transactional(readOnly = true)
    @GetMapping("/api/v1/menulist")
    public ResponseEntity<List<MenuVo>> getAllMenu () {
        List<MenuVo> list = menuService.findAll();
        return new ResponseEntity<List<MenuVo>>(list, HttpStatus.OK);
    }


    // 모든 회원 조회
    @GetMapping("/menulist")
    public ResponseEntity<List<MenuVo>> getAllmembers() {
        List<MenuVo> menu = menuService.findAll();
        return new ResponseEntity<List<MenuVo>>(menu, HttpStatus.OK);
    }


}
