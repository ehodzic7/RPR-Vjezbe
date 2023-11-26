class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<MozePredstaviti> predstavljanja) {
        this.poruke = new ArrayList<>();
        for (MozePredstaviti predstavljanje : predstavljanja) {
            poruke.add(predstavljanje.predstavi());
        }
    }

    public List<String> getPoruke() {
        return Collections.unmodifiableList(poruke);
    }
}