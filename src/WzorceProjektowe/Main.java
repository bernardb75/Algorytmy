package WzorceProjektowe;

import WzorceProjektowe.WzorzecStrategia.DzikaKaczka;
import WzorceProjektowe.WzorzecStrategia.KaczkaModel;
import WzorceProjektowe.WzorzecStrategia.PlaskonosKaczka;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.LotZNapedemRakietowym;

public class Main {
    public static void main(String[] args) {
        DzikaKaczka dzkaczka=new DzikaKaczka();
        //dzkaczka.wyswietl();
        PlaskonosKaczka plaskonosKaczka=new PlaskonosKaczka();
        //plaskonosKaczka.wyswietl();
        plaskonosKaczka.wykonajKwacz();

        KaczkaModel kaczkaModel=new KaczkaModel();
        kaczkaModel.wykonajLec();
        kaczkaModel.setLatanieInterfejs(new LotZNapedemRakietowym());
        kaczkaModel.wykonajLec();
    }
}
