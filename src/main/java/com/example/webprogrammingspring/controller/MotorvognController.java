package com.example.webprogrammingspring.controller;

import com.example.webprogrammingspring.model.Car;
import com.example.webprogrammingspring.model.Motorvogn;
import com.example.webprogrammingspring.repository.MotorvognRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotorvognController {

    MotorvognRepository repo;

    @Autowired
    public MotorvognController(MotorvognRepository repo){
        this.repo = repo;
    }

    @GetMapping("/api/carList")
    public List<Car> hentCar(){
        return repo.henteAlleCar();
    }
    @PostMapping("/api")
    public void lagre(Motorvogn motorvogn){
        repo.lagreMotor(motorvogn);
    }

    @GetMapping("/api/hentMotor")
    public List<Motorvogn> henteAlleMotor(){
        return repo.henteMotor();
    }

    @DeleteMapping("api")
    public void slett(){
        repo.slettMotor();
    }


}
