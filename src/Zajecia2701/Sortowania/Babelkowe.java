package Zajecia2701.Sortowania;

public class Babelkowe {
    public static void main(String[] args) {
        int[] tab = {3, 4, 5, 2, 1};
        int n = 5;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    //SWAP
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
}
