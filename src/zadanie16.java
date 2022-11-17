import java.util.Scanner;


public class zadanie16 {
    public static void main(String[] args) {
        double ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5, wynik;
        ksiazka1 = 0;
        ksiazka2 = 5;
        ksiazka3 = 2;
        ksiazka4 = 3;
        ksiazka5 = 4;
        Scanner scanner = new Scanner(System.in);
        int punktow;
        System.out.println("podaj ilosc czekow: ");
        punktow = scanner.nextInt();
        if (ksiazka1 == 0) {
            punktow = 0;
        }
        if (ksiazka2==1){
            punktow =5;
        }
        if (ksiazka3==2){
            punktow = 15;
        }
        if (ksiazka4 ==3){
            punktow= 30;

        }
        if (ksiazka5==4){
            punktow = 60;
        }








    }
}