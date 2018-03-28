package WzorceProjektowe.WzorzecObserwator.StacjaPogodowa;


import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

    private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
    private float temp;
    private float wilgotnosc;
    private float cisnienie;


    public void odczytyZmiana() {
//        float temp = pobierzTemperature();
//        float wilgotnosc = pobierzWilgotnosc();
//        float cisnienie = pobierzCisnienie();
        przekazAkrtualizacje();

        //warunkiBiezaceWyswietlac.aktualizacja(temp,wilgotnosc,cisnienie);

    }

    public void ustawOdczyt(float temp, float wilgotnosc, float cisnienie){
        this.temp=temp;
        this.wilgotnosc=wilgotnosc;
        this.cisnienie=cisnienie;
        odczytyZmiana();
    }

    @Override
    public void dodajNaListeSusbskrybentow(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunZListySybskrybentow(Obserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void przekazAkrtualizacje() {
        for (Obserwator obserwator :obserwatorzy) {
            obserwator.aktualizacje(temp,wilgotnosc,cisnienie);
        }

    }
}
