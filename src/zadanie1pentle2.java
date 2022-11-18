import java.util.Scanner;
public class zadanie1pentle2 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int liczby;
int suma1;
        System.out.println("podaj liczbe dodatnią nie zerową");
        liczby=scanner.nextInt();
for( int i =1; i < liczby ;i++){
    int suma = i+i;

    System.out.println("suma wynosi:" + suma);


}

System.out.println("koniec");
    }
}
