package com.dave.doyouevenrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Dave Harms
 * Date: 2/18/22
 * Time: 5:59 AM
 */
@RestController
@RequestMapping("/api/v1/hello")
public class Hello {

    @GetMapping
    public String getHelloWorldString() {
        return "Hello World";
    }
}
