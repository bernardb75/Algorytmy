package Zajecia2701.Sortowania;

import java.util.Scanner;

public class OdlegloscOdSrodka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] input = new int[n][3];
        double[][] sort = new double[n][2];

        for (int i = 0; i < n; i++) {
            String stringForUser = scanner.nextLine();
            String[] inputSplited = stringForUser.split(" ");
            input[i][0] = Integer.parseInt(inputSplited[0]);//nazwa
            input[i][1] = Integer.parseInt(inputSplited[1]);//x
            input[i][2] = Integer.parseInt(inputSplited[2]);//y

            sort[i][0] = input[i][0];//nazwa
            sort[i][1] = policzOdleglosc(input[i][1], input[i][2]);
        }

        for (int i = 0; i < sort[0].length; i++) {
            for (int j = 0; j < sort[0].length; j++) {
                if (sort[j][1] > sort[j + 1][1]) {
                    //SWAP
                    double temp = sort[j][0];
                    sort[j + 1][0] = sort[j+1][0];
                    sort[j+1][0] = temp;

                    temp = sort[j][1];
                    sort[j + 1][1] = sort[j+1][1];
                    sort[j+1][1] = temp;
                }
            }
        }
        for (int i = 0; i < input[0].length; i++) {
            int nazwa = (int) sort[i][0];
            for (int j = 0; j < input[0].length; j++) {
                if (nazwa == input[j][0]) {
                    System.out.printf("%d,%d,%d \n", input[j][0], input[j][1], input[j][2]);
                    break;
                }
            }
        }
    }

    public static double policzOdleglosc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
