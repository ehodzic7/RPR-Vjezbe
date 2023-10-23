import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int sumaCifara(int broj){
        int suma=0;
        while(broj>0){
            suma +=broj%10;
            broj /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite n: ");
        int n=sc.nextInt();
        for(int broj=1; broj<=n; broj++){
            if(broj%sumaCifara(broj)==0){
                System.out.println(broj);
            }
        }

    }
}