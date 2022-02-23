package com.example.webprogrammingspring.controller;

import com.example.webprogrammingspring.service.TemperaturService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturController {

    @Autowired
    TemperaturService service;

    @GetMapping("/temp")
    public int temperatur(String maned){
        return service.temperatur(maned);
    }
}
