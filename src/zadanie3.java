import java.util.Scanner;
public class zadanie3 {

    public static void main(String[] args) {

        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        char slowo;
        int i=0;

        while (twierdzenie) {

            System.out.println("wprowadz Tak lub Nie");
            slowo= scan.next().charAt(0);

            if(slowo=='t'||slowo=='n') {
                twierdzenie = true;
            }else {
                twierdzenie = false;

            }

            System.out.println("Podałeś "+ slowo);


        }
        i++;
    }
}
