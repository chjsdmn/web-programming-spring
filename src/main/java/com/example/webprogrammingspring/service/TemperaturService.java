package com.example.webprogrammingspring.service;

import org.springframework.stereotype.Service;


@Service
public class TemperaturService {
    private final Integer[] tempArray = new Integer[] {-3,-2,2,7,12,16,18,17,12,7,3,-2};

    public int temperatur(String maned) throws NumberFormatException{
        //return the result of switch directly
        return switch (maned.toLowerCase()){  //adjust input data by .toLowerCase()
            case "januar" -> tempArray[0];
            case "februar" -> tempArray[1];
            case "mars" -> tempArray[2];
            case "april" -> tempArray[3];
            case "mai" -> tempArray[4];
            case "juni" -> tempArray[5];
            case "juli" -> tempArray[6];
            case "august" -> tempArray[7];
            case "september" -> tempArray[8];
            case "oktober" -> tempArray[9];
            case "november" -> tempArray[10];
            case "desember" -> tempArray[11];
            default -> throw new NumberFormatException("Wrong month");
        };
    }
}
