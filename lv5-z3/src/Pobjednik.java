
class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;

    public Pobjednik(KolekcijaImena kolekcijaImena) {
        this.ime = kolekcijaImena.getNajduzeIme();
        this.prezime = ""; // Postavljamo prezime na prazan string, jer u KolekcijaImena nema prezimena
        this.brojZnakova = ime.length();
    }

    public Pobjednik(KolekcijaImenaIPrezimena kolekcijaImenaIPrezimena, int indeks) {
        this.ime = kolekcijaImenaIPrezimena.getImena().get(indeks);
        this.prezime = kolekcijaImenaIPrezimena.getPrezimena().get(indeks);
        this.brojZnakova = ime.length() + prezime.length();
    }

    public void ispisiInfo() {
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Broj znakova: " + brojZnakova);
    }
}
