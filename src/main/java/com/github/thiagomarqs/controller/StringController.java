package com.github.thiagomarqs.controller;

import com.github.thiagomarqs.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/reverse")
    public String reverse(@RequestParam("string") String s) {
        return StringUtils.reverse(s);
    }
}
