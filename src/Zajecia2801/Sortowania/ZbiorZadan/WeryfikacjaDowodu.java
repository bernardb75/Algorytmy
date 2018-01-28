package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class WeryfikacjaDowodu {
    public static void main(String[] args) {
        char[] tabLit = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] tabWagiLit = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

        Scanner scanner = new Scanner(System.in);
        char[] dowodKod = scanner.nextLine().toCharArray();
        int[] sumaCzesciowa = new int[dowodKod.length];

        //int pozycja;
        for (int i = 0; i < dowodKod.length; i++) {
            int pozycja = 0;
            for (int j = 0; j < tabLit.length; j++) {
                if (tabLit[j] == dowodKod[i]) {
                    pozycja = j;
                    break;
                }
            }
            sumaCzesciowa[i] = tabWagiLit[pozycja];
        }
        int[] wagi = {7, 3, 1, 9, 7, 3, 1, 7, 3,};
        int counter = 0;
        for (int i = 0; i < wagi.length; i++) {
            sumaCzesciowa[i] *= wagi[i];
            counter += sumaCzesciowa[i];
        }
        if (counter % 10 == 0)
            System.out.println("Numer Dowodu  jest prawidłowy");
        else System.out.println("Nr.Nieprawidłowy");
    }
}
