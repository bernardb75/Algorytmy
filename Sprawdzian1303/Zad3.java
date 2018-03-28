import java.util.Random;

public class Zad3 {
    public static void main(String[] args) {
        String input = String.valueOf(20);

        int trials = Integer.parseInt(input);

        int positive = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Random rand = new Random();

        for (int i = 0; i < trials; i++){
            int random = rand.nextInt(200) + (-100);
            if(random > 0) positive ++;
            if(random > max) max = random;
            if(random < min) min = random;
        }

        System.out.println("Max: " + max + " min: " + min +
                " Dodatnie do ujemnych: " + (double)positive/trials);
    }
}
