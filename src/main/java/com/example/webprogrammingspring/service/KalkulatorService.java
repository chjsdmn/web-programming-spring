package com.example.webprogrammingspring.service;

import org.springframework.stereotype.Service;

@Service
public class KalkulatorService {
    public String pluss(String tall1S, String tall2S){
        int tall1, tall2;
        try{
            tall1 = Integer.parseInt(tall1S);
            tall2 = Integer.parseInt(tall2S);
        }
        catch (Exception e){
            return "Må skrive inn taller på begge feltene.";
        }
        return tall1S + " + " + tall2S + " = " + (tall1 + tall2);
    }

    public String minus(String tall1S, String tall2S){
        int tall1, tall2;
        try{
            tall1 = Integer.parseInt(tall1S);
            tall2 = Integer.parseInt(tall2S);
        }
        catch (Exception e){
            return "Må skrive inn taller på begge feltene.";
        }
        return tall1S + " - " + tall2S + " = " + (tall1 - tall2);
    }

    public String multi(String tall1S, String tall2S){
        int tall1, tall2;
        try{
            tall1 = Integer.parseInt(tall1S);
            tall2 = Integer.parseInt(tall2S);
        }
        catch (Exception e){
            return "Må skrive inn taller på begge feltene.";
        }
        return tall1S + " * " + tall2S + " = " + (tall1 * tall2);
    }

    public String dele(String tall1S, String tall2S){
        int tall1, tall2;
        try{
            tall1 = Integer.parseInt(tall1S);
            tall2 = Integer.parseInt(tall2S);
        }
        catch (Exception e){
            return "Må skrive inn taller på begge feltene.";
        }
        if(tall2 == 0) return "Tall2 kan ikke være 0 fordi det kan ikke deles med 0";
        return tall1S + " / " + tall2S + " = " + ((double)tall1 / (double) tall2);
    }
}
