package Zajecia2701;

import java.util.Scanner;

public class SzyfrCezara {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z'};
        Scanner scaner = new Scanner(System.in);
        char[] toCode=scaner.next().toUpperCase().toCharArray();
        int key=scaner.nextInt();

        for (int i = 0; i <toCode.length ; i++) {
            int letter=0;
            for (int j = 0; j <letters.length ; j++) {
                if (letters[j]==toCode[i]){
                    letter=j;
                    break;
                }
            }
            System.out.println(letters[(letter+key)%26]);
        }

    }
}
