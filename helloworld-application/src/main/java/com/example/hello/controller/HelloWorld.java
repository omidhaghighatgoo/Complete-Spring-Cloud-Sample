package com.example.hello.controller ;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
