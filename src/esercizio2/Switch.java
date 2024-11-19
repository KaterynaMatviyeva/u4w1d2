package esercizio2;

import java.util.Scanner;

public class Switch {
    public static void messaggio(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch(x){
            case 0:
            System.out.println("zero");
            break;
            case 1:
                System.out.println("uno");
                break;
        }

    }
}
