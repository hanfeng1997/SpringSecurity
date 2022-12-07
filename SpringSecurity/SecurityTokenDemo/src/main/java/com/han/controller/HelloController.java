package com.han.controller;

import com.han.entity.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize(("@ex.hasAuthority('system:dept:list')"))
//    @PreAuthorize("hasAuthority('system:dept:list')")
    public String hello(){
        return "hello";
    }

    @PostMapping("/testCors")
    public ResponseResult testCors(){
        return new ResponseResult(200, "testCors");
    }

    @GetMapping("/bey")
    @PreAuthorize("hasAuthority('test')")
    public String bey(){
        return "bey";
    }
}
