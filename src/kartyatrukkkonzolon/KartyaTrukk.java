
package kartyatrukkkonzolon;

import java.util.Scanner;


public class KartyaTrukk {
    
    private static final Scanner sc = new Scanner(System.in);

    public KartyaTrukk() {
        indit();
    }
    
    
      private  void indit() {
        Pakli kartyak=new Pakli();
        kartyak.feltolt();
        for (int i = 0; i < 3; i++) {
            kartyak.kirak();
            kartyak.kever(melyik());
        }
        kartyak.ezVolt();
    }
      
      private  int melyik() {
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
