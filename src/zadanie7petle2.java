import java.util.Scanner;
public class zadanie7petle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pietra;
        int liczbawszystkichpokoi;
        int liczbapokoizajetych;
        System.out.println("podaj liczbe pieter:");
        pietra = scanner.nextInt();
        for (int i = 1; i <= pietra; i++) {
            int liczbawszystkichpokoipietra;
            System.out.println("liczba pokoi to:" + i + "pietra");
            liczbawszystkichpokoipietra = scanner.nextInt();

            int liczbazajetychpokoipietra;
            System.out.println("liczba zajetych:" + i + "pietra");
            liczbazajetychpokoipietra = scanner.nextInt();
            if (i == pietra) {

                liczbawszystkichpokoi = liczbawszystkichpokoipietra;
                liczbapokoizajetych = liczbawszystkichpokoipietra - liczbawszystkichpokoi;
                if (i == pietra) {
                    System.out.println("lizcba wszystkich pokoi to" + liczbawszystkichpokoi);
                    System.out.println("lizcba zajetych pokoi" + liczbapokoizajetych);
                }
            }
        }
    }
}

