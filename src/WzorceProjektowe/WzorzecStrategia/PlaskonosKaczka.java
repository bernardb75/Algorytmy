package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.Kwacz;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka{

    public PlaskonosKaczka(){
        latanieInterfejs=new LatamBoMamSkrzydla();
        kwakanieInterfejs=new Kwacz();
    }
public void wyswietl(){
    //super.wyswietl();
    System.out.println("Wyswietlam płaskonos");
}
}
