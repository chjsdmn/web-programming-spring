package com.example.webprogrammingspring.controller;

import com.example.webprogrammingspring.service.KalkulatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KalkulatorController {

    @Autowired
    KalkulatorService service;

    @GetMapping("/pluss")
    public String pluss(String tall1S, String tall2S){
        return service.pluss(tall1S, tall2S);
    }

    @GetMapping("/minus")
    public String minus(String tall1S, String tall2S){
        return service.minus(tall1S,tall2S);
    }

    @GetMapping("/multi")
    public String multi(String tall1S, String tall2S){
        return service.multi(tall1S,tall2S);
    }

    @GetMapping("/dele")
    public String dele(String tall1S, String tall2S){
        return service.dele(tall1S,tall2S);
    }
}
