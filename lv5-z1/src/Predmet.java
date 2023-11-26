class Predmet implements MozeOcijeniti {
    private String naziv;
    private String opis;
    private List<Ocjena> ocjene;

    public Predmet(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
        this.ocjene = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    @Override
    public Ocjena ocijeni(int x, LicneInformacije osoba) {
        Ocjena novaOcjena = new Ocjena(osoba, x);
        ocjene.add(novaOcjena);
        return novaOcjena;
    }
}