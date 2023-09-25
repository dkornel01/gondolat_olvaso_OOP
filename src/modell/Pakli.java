package modell;

public class Pakli {

    //private String[] pakli=new String[22];
    private String[] pakli;

    public Pakli(String[] pakli) {
        this.pakli = pakli;
        feltolt();
    }

    public String[] getPakli() {
        return pakli;
    }

    public void setPakli(String[] pakli) {
        this.pakli = pakli;
    }

    private void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                Lap lap = new Lap(szin + "_" + ertekek[e]);
                pakli[i++] = lap.getLeiras();
            }
        }
        setPakli(pakli);
    }
    
     public void kever(int oszlop) {
        // mindig középre a választott
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;
        setPakli(pakli);
    }

}
