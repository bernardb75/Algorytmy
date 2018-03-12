package WzorceProjektowe.WzorzecFasada.Ubior;

import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.InterfaceUbranie;
import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.Koszule;
import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.Okulary;

public class FasadaWiosenna implements InterfaceUbranie {
    private Okulary okulary;
    private Koszule koszule;

    public FasadaWiosenna(Okulary okulary, Koszule koszule) {
        this.okulary = okulary;
        this.koszule = koszule;
    }

    @Override
    public void zalozUbranie() {
        okulary.ubierzSie();
        koszule.ubierzSie();
    }

    @Override
    public void zdejmijUbranie() {
        okulary.rozbierzSie();
        koszule.rozbierzSie();

    }
}
