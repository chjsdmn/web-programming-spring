package com.example.webprogrammingspring.service;

import com.example.webprogrammingspring.model.Kunde;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KundeService {
    private final List<Kunde> kundeList = new ArrayList<>();

    public void lagreKunde(Kunde kunde){
        kundeList.add(kunde);
    }

    public List<Kunde> henteAlleKunde(){
        return kundeList;
    }

    public List<Kunde> slettKunde(){
        kundeList.clear();
        return kundeList;
    }
}
