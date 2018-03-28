package WzorceProjektowe.StrategieSortowania.Sortowania;

public class SortowanieBabelkowe implements SortowanieInterfejs {


    @Override
    public int[] sort(int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length - 1; j++)
            {
                if (toSort[j] > toSort[j + 1])
                {
                    int temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                }
            }

        }
        return toSort;
    }
}