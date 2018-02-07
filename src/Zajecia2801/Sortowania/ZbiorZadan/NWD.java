package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {
        ObliczNWD();
    }
    static int NWD(int a, int b) {
        if (b == 0) {
            return a;
        } else return NWD(b, b % a);
    }

    public static void ObliczNWD() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("NWD( %s, %s) = %s\n", a, b, NWD(a, b));
    }
}
