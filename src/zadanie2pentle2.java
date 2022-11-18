import java.util.Scanner;


public class zadanie2pentle2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int odleglosc;
        int szybkosc;
        int czas;
        int predkosc;
        System.out.println("podaj szybkosc w km: ");
        szybkosc = scanner.nextInt();
        System.out.println("podaj czas w godz:");
        czas = scanner.nextInt();
        for(int i =1; i <=czas; i++) {
            odleglosc = szybkosc * i;


            System.out.println("przebyta droga nad czas to" + i + "+" + odleglosc);
        }

    }
}
