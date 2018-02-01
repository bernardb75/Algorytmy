package Zajecia2701.PracaDomowa2701;

import java.util.Scanner;

public class tabliceDominanta {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Rozmiar tablicy 'n': ");
        int n = scanner.nextInt();
        int indeks = 0;
        int ileLiczb = 0;

        int[] szukanaDominantaT = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ":");
            szukanaDominantaT[i] = scanner.nextInt();
        }
        int[] przechowywaneTablicyL = new int[n];
        int[] ilosc = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = szukanaDominantaT[i];
            for (int j = 0; j < n; j++) {
                if (przechowywaneTablicyL[j] == temp) {
                    ++ilosc[j];
                    break;
                } else if (j == n - 1) {
                    przechowywaneTablicyL[indeks] = temp;
                    ilosc[indeks] = 1;
                    ++indeks;
                    ++ileLiczb;
                }
            }
        }
        int dominanta = 0;
        int licznik = 0;
        for (int i = 0; i < ileLiczb; i++) {
            if (ilosc[i] > ilosc[dominanta]) {
                dominanta = i;
                licznik = 1;
            } else if (ilosc[i] == ilosc[dominanta]) {
                ++licznik;
            }
        }
        if (licznik == 1) {
            System.out.println("Domianta: " + przechowywaneTablicyL[dominanta] + " :Wystapiła: " + ilosc[dominanta] + " razy");
        } else System.out.println("Nie ma dominanty");
    }
}
