package Zajecia2701.PracaDomowa2701;

import java.util.Scanner;

public class NajwiekszyWspolnyDzielnik {

        public static void main(String[] args) {
            ObliczNajWspDzielnik();
        }

        static int NajWspDzielnik(int a, int b) {
            if (b == 0) {
                return a;
            } else return NajWspDzielnik(b, a % b);
        }

        public static void ObliczNajWspDzielnik() {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.printf("Najmniejszy Wspolny Dzielnik(%s,%s) = %s\n", a, b, NajWspDzielnik(a, b));
        }
}
