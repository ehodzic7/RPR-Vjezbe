//package com.company;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    private Imenik imenik;

    @BeforeEach
    public void setUp() {
        imenik = new Imenik();
    }

    @Test
    public void dodajIProvjeraBrojaTest() {
        FiksniBroj fiksniBroj = new FiksniBroj(Grad.SARAJEVO, "123-456");
        imenik.dodaj("Osoba1", fiksniBroj);
        assertEquals(fiksniBroj.ispisi(), imenik.dajBroj("Osoba1"));
    }

    @Test
    public void dajImeTest() {
        MobilniBroj mobilniBroj = new MobilniBroj(61, "987-654");
        imenik.dodaj("Osoba2", mobilniBroj);
        assertEquals("Osoba2", imenik.dajIme(mobilniBroj));
    }

    @Test
    public void naSlovoTest() {
        FiksniBroj fiksniBroj = new FiksniBroj(Grad.SARAJEVO, "123-456");
        MobilniBroj mobilniBroj = new MobilniBroj(61, "987-654");
        MedunarodniBroj medunarodniBroj = new MedunarodniBroj("+387", "111-222");
        imenik.dodaj("Osoba1", fiksniBroj);
        imenik.dodaj("Osoba2", mobilniBroj);
        imenik.dodaj("Osoba3", medunarodniBroj);

        assertEquals(2, imenik.naSlovo('O').size());
        assertTrue(imenik.naSlovo('O').contains("Osoba1 - " + fiksniBroj.ispisi()));
        assertTrue(imenik.naSlovo('O').contains("Osoba2 - " + mobilniBroj.ispisi()));
        assertFalse(imenik.naSlovo('O').contains("Osoba3 - " + medunarodniBroj.ispisi()));
    }

    @Test
    public void nepostojeciKontaktTest() {
        assertNull(imenik.dajBroj("NepostojecaOsoba"));
    }
}

