package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class WeryfikacjaPesel {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] wagaPesel = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

        String peselKod = scanner.nextLine();
        int suma = 0;
        for (int i = 0; i < peselKod.length(); i++) {
            int wartosc = Integer.parseInt(peselKod.substring(i, i + 1));
            suma += wartosc * wagaPesel[i];
        }
        if (suma%10==0)
            System.out.println("Pesel poprawny");
        else System.out.println("Pesel niepoprawny");
    }
}
