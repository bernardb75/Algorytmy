package Zajecia0302;

public class WyszukiwanieLidera {

    public static void main(String[] args) {
        int[] tab={1,2,2,2,1,6,2};

        int max=Integer.MIN_VALUE;
        for (int i = 0; i <tab.length ; i++) {
            if (max<tab[i]){
                max=tab[i];
            }
        }
        int[] tabZlicz=new int[max+1];
        for (int i = 0; i <tab.length ; i++) {
            tabZlicz[tab[i]]++;
        }
        int maxIdx = 0;
        for (int i = 0; i <tabZlicz.length ; i++) {
            if (tabZlicz[maxIdx] < tabZlicz[i]){
                maxIdx=i;
            }
        }
        if (tabZlicz[maxIdx]/(double)tab.length >= 0.5){
            System.out.println(maxIdx);
        }
        else {
            System.out.println(-1);
        }
    }
}
