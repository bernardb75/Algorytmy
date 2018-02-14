package Zajecia0302.PracaDomowa0302;

public class ArrayList {
    public static void main(String[] args) {

        String input = "4[1,2,2,3,4,2,4]";
        String numberString = input.substring(0, input.indexOf("[")).trim();
        String values = input.substring(input.indexOf("[") + 1,
                input.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        int number = Integer.parseInt(numberString);
        int suma = 0;
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);
            suma += valuesInt[i];
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int newSuma = 0;
        for (int i = 0; i < valuesInt.length; i++) {
            if (valuesInt[i] != number) {
                sb.append(valuesInt[i]);
                sb.append(",");
                newSuma += valuesInt[i];
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append("]");
        System.out.println("Wejscie: " + input + " ,suma: " + suma);
        System.out.println("Usuniete: " + numberString);
        System.out.printf("Wyjscie: %s ,nowa suma: %s",sb.toString(),newSuma);
    }
}

