package Zadanie1;

public class zad1 {
    public static int wystapienie_litera(String args, char litera)
    {
        int ile_liter = 0;
        char znak_z_napisu;
        for (int i = 0 ; i < args.length() ; i++)
        {
            znak_z_napisu = args.charAt(i);
            if(znak_z_napisu == litera)
            {
                ile_liter++;
            }
        }
        return ile_liter;
    }

    public static void main(String[] args)
    {
        String s = "";
        for (String arg : args) {
            s = s.concat(arg).toLowerCase().replace(".", "");
        }
        System.out.println(wystapienie_litera(s,'a'));
    }


}
