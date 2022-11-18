import java.util.Scanner;

public class zadanie8petle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaopadow;
        int srednipoziom;
        int liczbalat;
        System.out.println("podaj liczbe lat");
        liczbalat = scanner.nextInt();
        for (int i = 1; i <= liczbalat; i++) {

            for (int n = 1; n < 12; n++) {

                System.out.println(" liczba opadow " + i + "w miesiacahc");
                liczbaopadow = scanner.nextInt();
                if (n == 12) {



                }
                System.out.println("liczba lat" + liczbalat);
                System.out.println("liczba opadow" + liczbaopadow);
                System.out.println("sredni poziom opadow");
            }

        }
    }
}
