package com.example.webprogrammingspring.controller;

import com.example.webprogrammingspring.model.Kunde;
import com.example.webprogrammingspring.service.KundeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class kundeController {

    @Autowired
    KundeService service;

    @PostMapping("/lagrekunde")
        public void lagreKunde(Kunde kunde){
            service.lagreKunde(kunde);
        }

    @GetMapping("/henteallekunde")
    public List<Kunde> henteAlleKunde(){
        return service.henteAlleKunde();
    }

    @PostMapping("/slett")
    public List<Kunde> slettKunde(){
        return service.slettKunde();
    }

}
