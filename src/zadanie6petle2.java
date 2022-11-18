


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class zadanie6petle2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        String imie;

        String lit;

        int a = 0;

        System.out.println("podaj słowo: ");
        imie = scanner.nextLine();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = klawiatura.nextLine();


        File mojPlik = new File(nazwaPliku);

        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }

        Scanner czytelnikPlik = new Scanner(mojPlik);

        while (czytelnikPlik.hasNext()) {
            String linia =  czytelnikPlik.nextLine();
            System.out.println("Kolejna linia pliku to " + linia);
        }

        czytelnikPlik.close();



        System.out.println("podaj litere: ");
        lit = klawiatura.nextLine();


        int dlugosc = imie.length();
        char ini;

        char litera1 = lit.charAt(0);
        for (int i = 0; i < dlugosc; i++) {
            ini = imie.charAt(i);
            if (ini == litera1) {
                a = a + 1;
            }


        }
    }
}