package WzorceProjektowe.WzorzecStrategia;

import WzorceProjektowe.WzorzecStrategia.SposobyKwakania.Piszcz;
import WzorceProjektowe.WzorzecStrategia.SposobyLatania.NieLatam;

public class GumowaKaczka extends Kaczka {

//    public void kwacz(){
//        System.out.println("Pisk");
//    }
//    public void lec(){
//        System.out.println("Nic nie rób");
//    }

    public void wyswietl(){
        System.out.println("Wyswietla gumową kaczke");
    }
    public GumowaKaczka(){//konstruktor
        kwakanieInterfejs=new Piszcz();//pola konstruktora
        latanieInterfejs=new NieLatam();
    }

}
