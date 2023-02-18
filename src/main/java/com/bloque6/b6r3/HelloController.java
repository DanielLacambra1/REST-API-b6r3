package com.bloque6.b6r3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello Spring World!";
    }
}
