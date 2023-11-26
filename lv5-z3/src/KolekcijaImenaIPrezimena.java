import java.util.List;

class KolekcijaImenaIPrezimena {
    private List<String> imena;
    private List<String> prezimena;

    public KolekcijaImenaIPrezimena(List<String> imena, List<String> prezimena) {
        this.imena = imena;
        this.prezimena = prezimena;
    }

    public List<String> getImena() {
        return imena;
    }

    public List<String> getPrezimena() {
        return prezimena;
    }

    public int getIndexNajduzegPara() {
        int indeks = 0;
        int najduziDuzina = 0;

        for (int i = 0; i < imena.size(); i++) {
            String imeIPrezime = imena.get(i) + prezimena.get(i);
            if (imeIPrezime.length() > najduziDuzina) {
                najduziDuzina = imeIPrezime.length();
                indeks = i;
            }
        }
        return indeks;
    }

    public String getImeiPrezime(int i) {
        return imena.get(i) + " " + prezimena.get(i);
    }
}
