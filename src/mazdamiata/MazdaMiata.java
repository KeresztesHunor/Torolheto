package mazdamiata;

public class MazdaMiata
{
    private String[] pakli;
    
    public static void main(String[] args)
    {
        new MazdaMiata().feladat();
    }
    
    private void feladat()
    {
        pakli = new String[22];
        String[] szinek = new String[] {
            "S",
            "H",
            "C",
            "D"
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
        for (int j = 0; j < szinek.length; j++)
        {
            int k = 0;
            while (k < szamok.length && i < pakli.length)
            {
                pakli[i++] = szinek[j] + "_" + szamok[k++];
            }
        }
    }
}
