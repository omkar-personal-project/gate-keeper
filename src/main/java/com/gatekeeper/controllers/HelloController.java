package com.gatekeeper.controllers;

import com.gatekeeper.services.impl.TestService;
import com.gatekeeper.services.interfaces.ITestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    TestService testService;
    @GetMapping
    public String GetHello(){
        testService.test();
        return "<h1>Hello!! from Gate Keeper";
    }
}
