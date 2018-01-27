package Zajecia2701;

public class SitoErystotelesa {
    public static void main(String[] args) {
        boolean[] array=new boolean[100];

        for (int i = 0; i <array.length ; i++) {
            array[i]=true;
        }
        for (int i = 2; i <array.length ; i++) {
            for (int j = i+i; j <array.length ; j+=i) {
                array[j]=false;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i])
                System.out.printf("%d\t",i);
        }

    }
}
