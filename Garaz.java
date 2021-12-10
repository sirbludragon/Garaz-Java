package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garaz {
    List<Pojazd> listaPojazdow = new ArrayList<Pojazd>();
    public void dodajPojazd(Pojazd dodawanyPojazd){
        listaPojazdow.add(dodawanyPojazd);
    }
    public void sortujPojemnosc(){
        int x=0;
        ArrayList<Double> listaPojemnosc = new ArrayList<Double>();
        for (int i=0;i<listaPojazdow.size();i++) {
            listaPojemnosc.add(listaPojazdow.get(i).pojemnoscSilnika);
        }
        System.out.println(listaPojemnosc);
        System.out.println(listaPojazdow);
        while (x<(listaPojazdow.size()-1)) {
            for (int i = 0; i < listaPojazdow.size() - 1; i++) {
                if (listaPojemnosc.get(i) > listaPojemnosc.get(i + 1)) {
                    Collections.swap(listaPojemnosc, i, i + 1);
                    Collections.swap(listaPojazdow,i,i+1);
                    x = 0;
                } else {
                    x++;
                }
            }
        }
        System.out.println(listaPojemnosc);
        System.out.println(listaPojazdow);
    }
    //
    // Lepszym rozwiązaniem było by użcie implements Comparable ! jednak w tym przypadku użyje takiej metody.
    //
    public void sortujAlfabet(){
        int x=0;
        ArrayList<String> listaAlafbet = new ArrayList<String>();
        ArrayList<Integer> listaAlafbet1 = new ArrayList<Integer>();
        ArrayList<Integer> listaAlafbet2 = new ArrayList<Integer>();
        for (int i=0;i<listaPojazdow.size();i++) {
            listaAlafbet.add(listaPojazdow.get(i).marka);
        }
        for (int i=0;i<listaPojazdow.size();i++){
            listaAlafbet1.add(listaAlafbet.indexOf(listaPojazdow.get(i).marka));
        }
        Collections.sort(listaAlafbet);
        for (int i=0;i<listaPojazdow.size();i++){
            listaAlafbet2.add(listaAlafbet.indexOf(listaPojazdow.get(i).marka));
        }
        for (int i=0;i<listaPojazdow.size()-1;i++){
            Collections.swap(listaPojazdow,listaAlafbet1.get(i),listaAlafbet2.get(i));
        }
        System.out.println(listaPojazdow);
    }
    public void usunPojazd(String marka,String model){
        boolean found=false;
        for (int i=0;i<listaPojazdow.size();i++){
            if (listaPojazdow.get(i).marka==marka&&listaPojazdow.get(i).model==model){
                listaPojazdow.remove(i);
                found=true;
            }
        }
        if (found==false){
            System.out.println("Nie znalezono");
        }

    }
    public void zawartoscGarazu(){
        System.out.println(listaPojazdow);
    }
}
