package WzorceProjektowe.WzorzecFasada.Ubior;

import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.Czapka;
import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.InterfaceUbranie;
import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.Kurtka;

public class FasadaZimowa implements InterfaceUbranie {
    private Kurtka kurtka;
    private Czapka czapka;

    public FasadaZimowa(Kurtka k, Czapka c) {
        this.kurtka = k;
        this.czapka = c;
    }

    public void zalozUbranie(){
        czapka.ubierzSie();
        kurtka.ubierzSie();
    }
    public void zdejmijUbranie(){
        czapka.rozbierzSie();
        kurtka.rozbierzSie();
    }


}
