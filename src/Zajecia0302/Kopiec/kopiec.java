package Zajecia0302.Kopiec;

public class kopiec {
    private int tab[] = new int[15];
    private int n = 0; //rozmiar biezacy kopca

    void addElementToKopiec(int element) {
        int i = n; //ustawiamy indeks i na pozycję wstawianego elementu
        n++; //zwiekszamy liczbe elementow
        int j = Math.floorDiv(i - 1, 2); //index rodzica

        while (i > 0 && tab[j] < element) {
            tab[i] = tab[j]; //umieszczamy rodzica w miejsce syna
            i = j; //przenosimy sie na pozycje ojca
            j = Math.floorDiv(i - 1, 2);//obliczamy index ojca
        }
        tab[i] = element;
    }

    public int deleteElement() {
        if (n > 0) {
            int root = tab[0];
            n--;
            int element = tab[n];
            int i = 0; //przeszukiwanie drzewa rozpoczynamy od korzenia
            int j = 1; // j wskazuje lewego syna
            while (j < n) {
                if (j + 1 < n && tab[j + 1] > tab[j]) {
                    //Jeśli (j + 1 < n) i (T[j + 1] > T[j]), to j = j + 1//szukamy większego syna
                    j = j + 1;
                }
                if (element > tab[j])
                    break;

                tab[i] = tab[j];
                i = j;
                j = 2 * j + 1;


            }
            tab[i] = element;
            return root;
        }
        return -1;
    }

    public void rozbiezKopiec(){
        int sortedTab[]=new int[n];
        for (int i = n-1; i >=0 ; i--) {
            sortedTab[i]=deleteElement();
        }
        for (int i = 0; i <sortedTab.length ; i++) {
            System.out.println(sortedTab[i]);
        }
    }

    void printAllElements() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d : %d \n", i, tab[i]);
        }
    }
}
