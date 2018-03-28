package Wielkanoc;

import java.util.Scanner;

public class dataWielkanoc {

    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h, i, j, k, l, m, p,dzien,miesiac;
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();
        a = rok % 19;
        b = (rok / 100);
        c = rok % 100;
        d=(b/4);
        e=b%4;
        f=((b+8)/25);
        g=((b-f+1)/3);
        h=(19*a+b-d-g+15)%30;
        i=c/4;
        k=c%4;
        l=(32+2*e+2*i-h-k)%7;
        m=(a+11*h+22*l)/451;
        p=((h+l-7*m+114)%31);
        dzien=p+1;
        miesiac=(h+l-7*m+114)/31;

        String[] strings={"styczen","luty","marzec","kwiecien","maj","czerwiec","lipiec","sierpien","wrzesien",
                "pazdziernik","listopad","grudzien"};
        System.out.println(dzien+" "+strings[miesiac-1]+" "+rok);


    }
}
