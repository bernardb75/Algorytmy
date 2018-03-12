package WzorceProjektowe.StrategieSortowania;

import WzorceProjektowe.StrategieSortowania.Sortowania.SortowanieInterfejs;

public class Sortowanie {
    private SortowanieInterfejs sortowanieInterfejs;

    public Sortowanie(SortowanieInterfejs sortowanieInterfejs) {
        this.sortowanieInterfejs = sortowanieInterfejs;
    }
    public int[] wykonajSortowanie(int[] toSort){
        return sortowanieInterfejs.sort(toSort);
    }
    public void setSortowanieInterfejs(SortowanieInterfejs sortowanieInterfejs){
        this.sortowanieInterfejs=sortowanieInterfejs;
    }
}
