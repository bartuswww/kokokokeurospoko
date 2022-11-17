import java.util.Scanner;


    public class zadanie15 {
        public static void main(String[] args) {
            double czek1, czek2, czek3, czek4, wynik;
            czek1 = 0.1;
            czek2 = 0.08;
            czek3 = 0.06;
            czek4 = 0.04;
            Scanner scanner = new Scanner(System.in);
            int liczbaczekow;
            System.out.println("podaj ilosc czekow: ");
            liczbaczekow = scanner.nextInt();
            if (liczbaczekow <= 20)
            {
                wynik = 10 + (liczbaczekow*czek1);
                System.out.println("cena: " + wynik);
            }
            else if (liczbaczekow <= 20 && liczbaczekow >=39)
            {
                wynik = 10 + liczbaczekow*czek2;
                System.out.println("cena: " + wynik);
            }
            else if (liczbaczekow <= 40 && liczbaczekow >=59)
            {
                wynik = 10 + liczbaczekow*czek3;
                System.out.println("cena: " + wynik);
            }
            else
            {
                wynik = 10 + liczbaczekow*czek4;
                System.out.println("cena: " + wynik);
            }

        }
    }