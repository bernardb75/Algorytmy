public class Zad1 {
    public static void main(String[] args) {
        int counter = 0;
        char letter = args[0].toLowerCase().charAt(0);

        for (int j = 1; j < args.length; j++) {
            for (int i = 0; i < args[j].length(); i++) {
                if(args[j].toLowerCase().charAt(i) == letter)
                    counter++;
            }
        }

        System.out.println(counter);

    }
}
