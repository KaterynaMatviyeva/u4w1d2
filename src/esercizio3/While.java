package esercizio3;

import java.util.Scanner;

public class While {
    public static void suddivisione(){
        Scanner scanner = new Scanner(System.in);
        String x = "";
        while (!x.equals(":q")){
            System.out.println("Inserisci una parola, :q per uscire");
            x = scanner.nextLine();
            if(x.equals(":q")){
                System.out.println("sto uscendo");
                break;


            }
            for (int i = 0; i < x.length(); i++) {
                System.out.println(x.charAt(i) + ",");
            }
        }
        scanner.close();
    }
}
