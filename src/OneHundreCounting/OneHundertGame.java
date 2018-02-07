package gra100;

import java.util.Random;
import java.util.Scanner;

public class OneHundertGame {
    private int game = 100;

    public void startOneHundert() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczby:[1-10]");
        while (game > 0) {
            int userIn = scanner.nextInt();
            if (userIn > 0 && userIn <= 10) {
                System.out.println("User Wprowadził: " + userIn);
                game -= userIn;
                System.out.println("User Pozostało: " + game);
                if (game == 0) {
                    System.out.println("Wygrał User");
                    break;
                }
            }
            int comIn = random.nextInt(10) + 1;
            if (comIn > 0 && comIn <= 10) {
                if (game<=10){
                    comIn=game+0;
                    System.out.println("Com WIN..");
                }
                System.out.println("Com Wprowadził: " + comIn);
                game -= comIn;
                System.out.println("Com Pozostało: " + game);
            }
        }
    }

    public static void main(String[] args) {
        OneHundertGame game = new OneHundertGame();
        game.startOneHundert();
    }
}
