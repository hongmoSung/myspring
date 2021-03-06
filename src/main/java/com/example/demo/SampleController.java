package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public @ResponseBody String sample() {
        return "webhook test";
    }

    @GetMapping("/sample2")
    public @ResponseBody String sample2() {
        return "sample2";
    }
}