package com.company;

public class Pojazd {
    static int liczbaPojazdow=0;
    String marka;
    String model;
    int iloscDrzwi;
    double pojemnoscSilnika;
    public Pojazd(String marka,String model,int iloscDrzwi,double pojemnoscSilnika){
        liczbaPojazdow++;
        this.marka=marka;
        this.model=model;
        this.iloscDrzwi=iloscDrzwi;
        this.pojemnoscSilnika=pojemnoscSilnika;
    }

    @Override
    public String toString() {
        return  "{marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", iloscDrzwi=" + iloscDrzwi +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                '}';
    }
}
