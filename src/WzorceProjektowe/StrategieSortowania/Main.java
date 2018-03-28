package WzorceProjektowe.StrategieSortowania;

import WzorceProjektowe.StrategieSortowania.Sortowania.SortowanieBabelkowe;
import WzorceProjektowe.StrategieSortowania.Sortowania.SortowaniePrzezZliczanie;

public class Main {
    public static void main(String[] args) {
        int[] toSort={5,4,3,2,1};

        Sortowanie sortowanie=new Sortowanie(new SortowanieBabelkowe());
        int[] poBabelkowym=sortowanie.wykonajSortowanie(toSort);

        for (int i :poBabelkowym) {
            System.out.println(i);
        }
sortowanie.setSortowanieInterfejs(new SortowaniePrzezZliczanie());
        int[] poZliczaniu=sortowanie.wykonajSortowanie(toSort);
        for (int i :poZliczaniu) {
            System.out.println(i);
        }

    }
}
