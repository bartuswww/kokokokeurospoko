import java.io.IOException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class zadanie3pentle2 {

    public static void main(String[] args)throws IOException {

        Scanner scanner = new Scanner(System.in);
        int odleglosc;
        int szybkosc;
        int czas;
        int predkosc;
        System.out.println("podaj szybkosc w km: ");
        szybkosc = scanner.nextInt();
        System.out.println("podaj czas w godz:");
        czas = scanner.nextInt();
        for (int i = 1; i <= czas; i++) {
            odleglosc = szybkosc * i;


            System.out.println("przebyta droga nad czas to" + i + "+" + odleglosc);
            PrintWriter pw = new PrintWriter("droga.txt");

            pw.println("droga przebyta :)" + odleglosc);


            pw.close();
        }

    }
}