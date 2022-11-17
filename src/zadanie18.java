import java.util.Scanner;
public class zadanie18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rest1, rest2, rest3, rest4, rest5;

        rest1 = "luksusowe burgery u jarka";
        rest2 = "pizzeria ";
        rest3 = "kawiarnia na rogu";
        rest4 = "kuchnia u szefa";
        rest5 = "wloskie specjaly";
        char wegan, wegetar, bezglu;

        System.out.println(" jestes wegetarian? T czy N?");
        wegetar = scanner.next().charAt(0);

        System.out.println("jestes wegan? T czy N?");
        wegan = scanner.next().charAt(0);

        System.out.println("jestes bezglutenowcem? T czy N?");
        bezglu = scanner.next().charAt(0);
        System.out.println(" mozecie isc do tych restauracji");

        if (wegetar =='N'&& wegan=='N'&& bezglu=='N' )
        {
            System.out.println(" masz do wyboru:"+ rest1);
            System.out.println(" masz do wyboru:"+ rest2);
            System.out.println(" masz do wyboru:"+ rest4);

        }
    else if (wegan =='T'&& wegetar=='N'&& bezglu=='N' )
        {
            System.out.println(" masz do wyboru:"+ rest2);
            System.out.println(" masz do wyboru:"+ rest5);
        }
        else if (wegan =='N'&& wegetar=='N'&& bezglu=='T' )
        {
            System.out.println(" masz do wyboru:"+ rest2);
            System.out.println(" masz do wyboru:"+ rest3);
            System.out.println(" masz do wyboru:"+ rest5);
        }

        else if (wegan =='T'&& wegetar  =='T'&& bezglu=='T' )
        {
            System.out.println(" masz do wyboru:"+ rest2);
            System.out.println(" masz do wyboru:"+ rest3);
            System.out.println(" masz do wyboru:"+ rest4);
            System.out.println(" masz do wyboru:"+ rest5);
        }
        else if (wegan =='N'&& wegetar=='T'&& bezglu=='N' )
        {
            System.out.println(" masz do wyboru:"+ rest2);
            System.out.println(" masz do wyboru:"+ rest3);
            System.out.println(" masz do wyboru:"+ rest4);
            System.out.println(" masz do wyboru:"+ rest5);
        }

    }

}
