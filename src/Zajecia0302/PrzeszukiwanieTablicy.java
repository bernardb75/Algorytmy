package Zajecia0302;

public class PrzeszukiwanieTablicy {

    public static void main(String[] args) {
        String input = "4 [1,4,78,3]";
        String numberString = input.substring(0, input.indexOf("[")).trim();
        String values = input.substring(input.indexOf("[") + 1,
                input.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        int number = Integer.parseInt(numberString);

        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
        }
        int index = -1;
        for (int i = 0; i < valuesInt.length; i++) {
            if (valuesInt[i] == number) {
                index = i + 1;
                break;
            }
        }
        System.out.printf("Pozycja-%s :liczba-%s",index,valuesInt[index]);

    }
}