package com.velgerguide2021.v21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class Main {
    @GetMapping
    public String home(){
        return "Velger Guide Hjemme Test";
    }



}
