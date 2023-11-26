class InformacijeONastavniku extends LicneInformacije {
    private String titula;
    private List<Ocjena> ocjene;

    public InformacijeONastavniku(String ime, String prezime, String titula) {
        super(ime, prezime);
        this.titula = titula;
        this.ocjene = new ArrayList<>();
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public List<Ocjena> getOcjene() {
        return ocjene;
    }

    public void dodajOcjenu(Ocjena ocjena) {
        ocjene.add(ocjena);
    }
}