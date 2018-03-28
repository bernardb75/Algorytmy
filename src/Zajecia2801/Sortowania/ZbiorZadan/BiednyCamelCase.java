package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class BiednyCamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        char[] tekstArr = tekst.toCharArray();

        for (int i = 0; i < tekstArr.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%c", Character.toUpperCase(tekst.charAt(i)));
            } else {
                System.out.printf("%c", Character.toLowerCase(tekst.charAt(i)));
            }
        }
    }
}
