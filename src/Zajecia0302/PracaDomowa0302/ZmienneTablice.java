package Zajecia0302.PracaDomowa0302;

import java.util.Scanner;

public class ZmienneTablice {

    public static void main(String[] args) {
        int ileElem, c, suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        ileElem = sc.nextInt();

        System.out.print("Szukana liczba: ");
        c = sc.nextInt();

        System.out.println("Elementy tablicy: ");
        int arr[] = new int[ileElem];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                suma++;
                if (suma == 1) {
                    System.out.print("Pierwsze wystąpienie elementu: " + c + " pozycja: " + i);
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                suma++;
                if (suma > 1) {
                    System.out.print("\nNastępne: " + c + " \npozycja: " + i);
                }
            }
        }
        if (suma == 0) {
            System.out.println("Nie ma powtórek");
        }
    }
}

