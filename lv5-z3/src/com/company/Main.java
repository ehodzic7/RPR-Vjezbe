package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static <KolekcijaImena, Pobjednik, KolekcijaImenaIPrezimena> void main(String[] args) {

        List<String> imena = Arrays.asList("Ana", "Marko", "Jovan", "Ivana");
        KolekcijaImena kolekcijaImena = new KolekcijaImena(imena);
        Pobjednik pobjednik1 = new Pobjednik(kolekcijaImena);
        pobjednik1.ispisiInfo();
        System.out.println();


        List<String> imena2 = Arrays.asList("Ana", "Marko", "Jovan", "Ivana");
        List<String> prezimena2 = Arrays.asList("Markovic", "Petrovic", "Jovanovic", "Ivanovic");
        KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena = new KolekcijaImenaIPrezimena(imena2, prezimena2);
        int indeksNajduzegPara = kolekcijaImenaIPrezimena.getIndexNajduzegPara();
        Pobjednik pobjednik2 = new Pobjednik(kolekcijaImenaIPrezimena, indeksNajduzegPara);
        pobjednik2.ispisiInfo();
    }
}

