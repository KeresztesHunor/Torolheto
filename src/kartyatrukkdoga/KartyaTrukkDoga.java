package kartyatrukkdoga;

import java.util.Scanner;

public class KartyaTrukkDoga
{
    private String[] pakli;
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        new KartyaTrukkDoga().feladat();
    }
    
    private void feladat()
    {
        pakliFeltolt();
        jatek();
    }
    
    private void pakliFeltolt()
    {
        pakli = new String[22];
        String[] szinek = new String[] {
            "P",
            "T",
            "Z",
            "M"
        };
        String[] szamok = new String[] {
            "V",
            "VI",
            "VII",
            "VIII",
            "IX",
            "X"
        };
        int i = 1;
        for (String szin : szinek)
        {
            int j = 0;
            while (j < szamok.length && i < pakli.length)
            {
                pakli[i++] = szin + "_" + szamok[j++];
            }
        }
    }
    
    private void jatek()
    {
        for (int i = 0; i < 3; i++)
        {
            kiir();
            kever(melyikOszlop());
        }
        ezVolt();
    }
    
    private void kiir()
    {
        String sor = "";
        for (int i = 1; i < pakli.length; i++)
        {
            sor += pakli[i] + "\t";
            if (i % 3 == 0)
            {
                System.out.println(sor);
                sor = "";
            }
        }
    }
    
    private void kever(int oszlop)
    {
        String[] ujPakli = new String[22];
        switch (oszlop)
        {
            case 1:
                for (int i = 1; i <= 7; i++)
                {
                    int kivonando = (i - 1) * 3;
                    ujPakli[i] = pakli[20 - kivonando];
                    ujPakli[i + 7] = pakli[19 - kivonando];
                    ujPakli[i + 14] = pakli[21 - kivonando];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++)
                {
                    int kivonando = (i - 1) * 3;
                    ujPakli[i] = pakli[21 - kivonando];
                    ujPakli[i + 7] = pakli[20 - kivonando];
                    ujPakli[i + 14] = pakli[19 - kivonando];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++)
                {
                    int kivonando = (i - 1) * 3;
                    ujPakli[i] = pakli[19 - kivonando];
                    ujPakli[i + 7] = pakli[21 - kivonando];
                    ujPakli[i + 14] = pakli[20 - kivonando];
                }
                break;
        }
        pakli = ujPakli;
    }
    
    private void ezVolt()
    {
        System.out.println("Erre a kártyára gondoltál: " + pakli[11]);
    }
    
    private int melyikOszlop()
    {
        System.out.print("Melyik oszlopban van [1-3]: ");
        return sc.nextInt();
    }
}
