package com.example.webprogrammingspring.repository;

import com.example.webprogrammingspring.model.Motorvogn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MotorvognRepository {

    private List<Motorvogn> list = new ArrayList<>();

    public void lagreMotor(Motorvogn motorvogn){
        list.add(motorvogn);
    }

    public List<Motorvogn> henteMotor(){
        return list;
    }

    public void slettMotor(){
        list.clear();
    }

}
