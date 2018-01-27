package Zajecia2701.Sortowania;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] toSort = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};
        int tabMax = -1;
        int licznik = 0;

        for (int i = 0; i < toSort.length; i++) {
            if (tabMax < toSort[i])
                tabMax = toSort[i];

        }
        int[] countingTable = new int[tabMax + 1];//zliczanie
        for (int i = 0; i < toSort.length; i++)
            countingTable[toSort[i]]++;
        for (int j = 0; j < countingTable.length; j++) {
            while (countingTable[j]>0){
                System.out.printf(j+" ");
                countingTable[j]--;
            }

        }
    }
}
