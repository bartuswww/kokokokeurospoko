import java.util.Scanner;
public class zadanie5petle2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        String imie;

        String lit;

        int a=0;

        System.out.println("podaj słowo: ");
        imie = klawiatura.nextLine();
        System.out.println("podaj litere: ");
        lit = klawiatura.nextLine();


        int dlugosc = imie.length();
        char ini;

        char litera1 = lit.charAt(0);
        for(int i = 0; i < dlugosc; i++)
        {
            ini = imie.charAt(i);
            if(ini==litera1)
            {
                a=a+1;
            }



        }
        System.out.println("Litera "+ lit+" wystepuje " + a );

    }
}
