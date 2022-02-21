package com.example.webprogrammingspring.controller;

import com.example.webprogrammingspring.model.Belop;  //引入model文件夹中的Belop对象
import com.example.webprogrammingspring.service.ValutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValutaController {
    @Autowired
    ValutaService service;

    @PostMapping("/load")
    public void load(){
        service.loadValuta();
    }

    @GetMapping("/belop")
    public double beregn(Belop belop){
        return service.beregn(belop);
    }
}
