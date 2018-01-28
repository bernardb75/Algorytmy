package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class DzienTygodnia {
    public static void main(String[] args) {
        String[] dniTygodnia = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};

        System.out.println("Podaj dzien tygodnia");
        Scanner scanner = new Scanner(System.in);

        String tempDzien = scanner.nextLine();
        int dzien = 0;
        dzien = scanner.nextInt();
        scanner.nextLine();


        int indexDzien = 0;
        for (int i = 0; i < dniTygodnia.length; i++) {
            if (dniTygodnia[i].equals(tempDzien)) {
                indexDzien = i;
            }
        }

        int wynik = (indexDzien + dzien) % 7;

        System.out.println(dniTygodnia[wynik]);
    }
}
