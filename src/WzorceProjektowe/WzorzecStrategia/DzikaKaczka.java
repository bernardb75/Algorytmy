package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.Kwacz;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        kwakanieInterfejs=new Kwacz();
        latanieInterfejs=new LatamBoMamSkrzydla();
    }

    public void wyswietl(){
        //super.wyswietl();
        System.out.println("Wyswietl dzika kaczka");
    }
}
