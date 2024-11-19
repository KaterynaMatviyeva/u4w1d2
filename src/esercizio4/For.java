package esercizio4;

import java.util.Scanner;

public class For {
    public static void stampaNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int y = scanner.nextInt();
            System.out.println("Inizio il conto alla rovescia");
        for (int i = y; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
