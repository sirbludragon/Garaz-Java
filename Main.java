package com.company;

public class Main {

    public static void main(String[] args) {
        Garaz garaz = new Garaz();
	    Pojazd car1 = new Pojazd("BMW","E39",5,2.6);
        Pojazd car2 = new Pojazd("Toyota","Corrola",5,1.6);
        Pojazd car3 = new Pojazd("Aston Martin","F91",5,3.6);
        Pojazd car4 = new Pojazd("Formula","B1",5,2.7);
        Pojazd car5 = new Pojazd("Volvo","S60",5,1.3);
        System.out.println(Pojazd.liczbaPojazdow);

        garaz.dodajPojazd(car1);
        garaz.dodajPojazd(car2);
        garaz.dodajPojazd(car3);
        garaz.dodajPojazd(car4);
        garaz.dodajPojazd(car5);
        garaz.sortujPojemnosc();
        garaz.sortujAlfabet();
        garaz.usunPojazd("BMW","E39");
        garaz.zawartoscGarazu();
    }
}
