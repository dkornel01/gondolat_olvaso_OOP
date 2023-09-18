
package kartyatrukkkonzolon;

import java.util.Scanner;


public class KartyaTrukk {
    
    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
        indit();
        melyik();
    }
    
    
      private static void indit() {
        int oszlop=melyik();
        Pakli kartyak=new Pakli(oszlop);
        
        for (int i = 0; i < 3; i++) {
            kartyak.Pakli();
        }
    }

    

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}
