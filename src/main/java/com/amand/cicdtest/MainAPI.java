package com.amand.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainAPI {

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
