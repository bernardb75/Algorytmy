package Zajecia0302;

public class WyszukiwanieMinMax {
<<<<<<< HEAD
    public static void main(String[] args) {
        String input = "[1,4,78,3]";
        String values = input.substring(input.indexOf("[") + 1, input.indexOf("]")).trim();
        String[] val = values.split(",");


        int[] valInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valInt[i]=Integer.parseInt(val[i]);
        }
        int min =Integer.MAX_VALUE, max =Integer.MIN_VALUE, arrMin = -1, arrMax = -1;
        for (int i = 0; i <valInt.length ; i++) {
            if (min>valInt[i]){
                min=valInt[i];
                arrMin=i;
            }
            if (max<valInt[i]){
                max=valInt[i];
                arrMax=i;
            }
        }
        System.out.println(arrMin+":"+min);
        System.out.println(arrMax+":"+max);

    }
=======
>>>>>>> master
}
