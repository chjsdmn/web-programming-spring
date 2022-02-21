package com.example.webprogrammingspring.model;

public class Belop {
    private String valutaSort;
    private double verdi;

    public Belop(String valutaSort, double verdi){
        this.valutaSort = valutaSort;
        this.verdi = verdi;
    }

    public String getValutaSort() { 
        return valutaSort;
    }

    public void setValutaSort(String valutaSort) {
        this.valutaSort = valutaSort;
    }

    public double getVerdi() {
        return verdi;
    }

    public void setVerdi(double verdi) {
        this.verdi = verdi;
    }
}
