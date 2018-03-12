package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.NieKwacz;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class KaczkaWabik extends Kaczka{

//    public void kwacz(){
//        System.out.println("Nic nie rób");
//    }
    //    public void lec(){
//        System.out.println("Nic nie rób");
//    }

    public KaczkaWabik(){
        latanieInterfejs=new NieLatam();
        kwakanieInterfejs=new NieKwacz();
    }
    public void wyswietl(){
        System.out.println("Wyswietla wabik");
    }

}
