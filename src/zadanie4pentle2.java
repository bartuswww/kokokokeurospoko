import java.util.Scanner;
public class zadanie4pentle2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double wyplata;
        double kwotazaokreso = 0;
        wyplata = 1;

        for (int i = 1; i <= 30; i++)
        {
            System.out.println("wyplata za dni: " + wyplata);
            kwotazaokreso += wyplata;
            wyplata = wyplata * 2;

        }
        System.out.println("wyplata wynosi: " + kwotazaokreso);


    }
    }

