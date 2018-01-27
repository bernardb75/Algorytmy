package Zajecia2701;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int suma=0;

        for (int i = 0; i <n; i++) {
            suma+=scanner.nextInt();
        }
        System.out.println(suma);
    }
}
