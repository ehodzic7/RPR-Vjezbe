import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        InformacijeOStudentu student = new InformacijeOStudentu("Marko", "Marković", "3. godina", "123");


        Predmet matematika = new Predmet("Matematika", "Opći opis matematike");


        System.out.print("Unesite ocjenu za predmet: ");
        int ocjenaZaPredmet = scanner.nextInt();
        Ocjena ocjenaPredmeta = matematika.ocijeni(ocjenaZaPredmet, student);

        System.out.println("Ocjena za predmet " + matematika.getNaziv() + ": " + ocjenaPredmeta.getOcjena());


        InformacijeONastavniku profesor = new InformacijeONastavniku("Profesor", "Profesorić", "Docent");


        System.out.print("Unesite ocjenu za nastavnika: ");
        int ocjenaZaNastavnika = scanner.nextInt();


        if (student instanceof MozeOcijeniti) {
            Ocjena ocjenaNastavnika = profesor.ocijeni(ocjenaZaNastavnika, student);
            System.out.println("Ocjena za nastavnika " + profesor.getIme() + " " + profesor.getPrezime() + ": " + ocjenaNastavnika.getOcjena());
        } else {
            System.out.println("Samo student može ocijeniti nastavnika.");
        }


        scanner.close();
    }
}
