package com.springlearn.clase1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    @ResponseBody
    public String Home() {
        return "Hola Mundo desde Spring Boot";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "<h1>about</h1>";
    }

    @GetMapping("/params/{id}")
    @ResponseBody
    public String params(@PathVariable("id") Long id) {
        return "params: " + id;
    }

    @GetMapping("/query-string")
    @ResponseBody
    public String queryString(@RequestParam("id") String id) {
        return "query-string: " + id;
    }
}
