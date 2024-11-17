package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/simple")
@RestController
public class SimpleController {

    @GetMapping("/saludo")
    public String getGreetings() {
        return "Hola mundo";
    }

    @PostMapping("/adios")
    public String getGoodBye() {
        return "Adios";
    }
}
