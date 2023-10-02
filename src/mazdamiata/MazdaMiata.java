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
    }
}
