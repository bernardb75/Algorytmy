package WzorceProjektowe.WzorzecFasada.Ubior;

import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.*;

public class Demo {
    public static void main(String[] args) {
        Kurtka k = new Kurtka();
        Czapka c = new Czapka();

        Okulary o=new Okulary();
        Koszule ko=new Koszule();


        FasadaZimowa zimowa = new FasadaZimowa(k, c);
        StrategiaZimowa strategiaZimowa = new StrategiaZimowa(zimowa);

        FasadaWiosenna wiosenna=new FasadaWiosenna(o,ko);

        System.out.println("****Zima*****");
        strategiaZimowa.ubierzZimowe();
        System.out.println("****Wiosna*****");
        strategiaZimowa.zdejmijZimowe();
        strategiaZimowa.setInterfaceUbranie(wiosenna);
        System.out.println("");
        wiosenna.zalozUbranie();
    }
}
