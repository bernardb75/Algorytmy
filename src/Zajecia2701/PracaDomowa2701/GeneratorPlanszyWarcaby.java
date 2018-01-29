package Zajecia2701.PracaDomowa2701;

import java.util.Scanner;

public class GeneratorPlanszyWarcaby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar planszy");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.printf("Rozmiar:[%d],[%d]", m, n);

        char[][] tab = new char[m][n];
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            for (int j = 0; j < tab.length; j++) {
                if ((i + j) % 2 == 1) {
                    tab[i][j] = 'C';
                } else tab[i][j] = 'B';
                System.out.print("\t" + tab[i][j]);
            }
        }
    }
}

