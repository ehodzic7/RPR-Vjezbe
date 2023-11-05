package com.company;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Imenik imenik = new Imenik();

        // Dodaj neke kontakte
        imenik.dodaj("Osoba1", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        imenik.dodaj("Osoba2", new MobilniBroj(61, "987-654"));
        imenik.dodaj("Osoba3", new MedunarodniBroj("+387", "111-222"));

        // Prikazi broj za određenu osobu
        System.out.println("Broj za Osoba1: " + imenik.dajBroj("Osoba1"));

        // Prikazi ime za određeni broj
        System.out.println("Ime za broj +387111-222: " + imenik.dajIme(new MedunarodniBroj("+387", "111-222"));

        // Prikazi sve kontakte koji počinju na slovo 'O'
        Set<String> kontaktiNaSlovoO = imenik.naSlovo('O');
        for (String kontakt : kontaktiNaSlovoO) {
            System.out.println(kontakt);
        }

        // Prikazi kontakte iz grada Sarajevo
        Set<TelefonskiBroj> kontaktiIzSarajeva = imenik.izGradaBrojevi(Grad.SARAJEVO);
        for (TelefonskiBroj broj : kontaktiIzSarajeva) {
            System.out.println(broj.ispisi());
        }
    }
}
