package com.example.greeting.controller ;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {
    @RequestMapping("/greet")
    public String greet() {
        return "Welcome to Omid Haghighatgoo Project";
    }
}
