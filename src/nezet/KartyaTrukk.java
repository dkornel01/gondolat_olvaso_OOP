
package nezet;

import modell.Pakli;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class KartyaTrukk {
    
    private static final Scanner sc = new Scanner(System.in);
    private String[] pakli = new String[22];
    public KartyaTrukk() {
        indit();
    }
    
      private void indit() {
        Pakli kartyak=new Pakli( pakli);
        for (int i = 0; i < 3; i++) {
            kirak(kartyak.getPakli());
            kartyak.kever(melyik());
        }
        ezVolt(kartyak.getPakli());
    }

    public void kirak(String[] pakli) {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.println("melyik oszlop (1-3): ");
            oszlop=sc.nextInt();
            //oszlop = Integer.parseInt(JOptionPane.showInputDialog("melyik oszlop (1-3): "));
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
         private void ezVolt(String[] pakli) {
        System.out.println("A választott lap: " + pakli[11]);
    }
}
