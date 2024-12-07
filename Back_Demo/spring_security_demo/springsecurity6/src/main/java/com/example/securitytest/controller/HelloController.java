package com.example.securitytest.controller;


import com.example.securitytest.domain.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("hello")
    @PreAuthorize("hasAuthority('delete') AND hasAuthority('view')")
    public String hello(){
        System.out.println(SecurityContextHolder.getContext().getAuthentication());
        return "hello world";
    }

    @PostMapping("testCors")
    public ResponseResult test(){
        System.out.println("testCors");
        return new ResponseResult(200,"testCors");
    }
}
