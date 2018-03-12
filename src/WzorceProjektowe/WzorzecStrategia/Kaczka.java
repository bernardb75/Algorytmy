package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.KwakanieInterfejs;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatanieInterfejs;

public abstract class Kaczka {
    protected LatanieInterfejs latanieInterfejs;
    protected KwakanieInterfejs kwakanieInterfejs;

    public void wykonajKwacz(){
        // kwacz//System.out.println("Kwa kwa");
        kwakanieInterfejs.kwacz();
    }
    public void plywaj(){
        System.out.println("Pływu pływu");
    }
    public void wyswietl(){
        System.out.println("Wyswietla kaczke");
    }
    public void wykonajLec(){
        // lec//System.out.println("Fru fru");
        latanieInterfejs.lec();
    }
    public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs){
        this.latanieInterfejs=latanieInterfejs;
    }

}
