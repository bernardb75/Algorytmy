package WzorceProjektowe.WzorzecObserwator.StacjaPogodowa.Wyswietlacze;

import WzorceProjektowe.WzorzecObserwator.StacjaPogodowa.Obserwator;
import WzorceProjektowe.WzorzecObserwator.StacjaPogodowa.Podmiot;
import WzorceProjektowe.WzorzecObserwator.StacjaPogodowa.WyswietlElement;

public class WarunkiBiezace implements Obserwator, WyswietlElement {
    private Podmiot danePogodowe;
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public  WarunkiBiezace(Podmiot danePogodowe){
        this.danePogodowe=danePogodowe;
        this.danePogodowe.dodajNaListeSusbskrybentow(this);

    }

    @Override
    public void aktualizacje(float temp, float wilgotnosc, float cisnienie) {
        this.temp=temp;
        this.cisnienie=cisnienie;
        this.wilgotnosc=wilgotnosc;
    }

    @Override
    public void wyswietlElement() {
        System.out.printf("Temp: %f :: Cisnienie %f :: Wilgotnosc %f\n", temp,cisnienie,wilgotnosc);
    }
}
