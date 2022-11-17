import java.util.Scanner;
public class zadanie1pentle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int x, n;

        System.out.println("podaj ilosc liczb:");
        x = scanner.nextInt();
        for (int i = 0; i <= x; i++)
        {

            for (int k = 0; k <= x; k++) {
                System.out.println("podaj liczbe:");
                n = scanner.nextInt();

                if (n >= 10 && n <= 24)
                    System.out.println("ta liczba jest w przedziale");
                else
                    System.out.println("ta liczba nie jest w przedziale");
            }



        }



    }
}