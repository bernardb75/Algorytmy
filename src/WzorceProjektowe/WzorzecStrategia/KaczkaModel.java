package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.KwakanieInterfejs;
import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.NieKwacz;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LatamBoMamSkrzydla;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LotZNapedemRakietowym;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class KaczkaModel extends Kaczka{
    public KaczkaModel(){
        latanieInterfejs=new LatamBoMamSkrzydla();
        kwakanieInterfejs=new NieKwacz();
    }
    public void wyswietl(){
        System.out.println("");
    }
}
