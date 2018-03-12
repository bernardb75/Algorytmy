package WzorceProjektowe.WzorzecObserwator.WzorzecObserwatorWbudowany.StacjaPogodowa;


import java.util.Observable;

public class DanePogodowe extends Observable {

    private float temp;
    private float wilgotnosc;
    private float cisnienie;


    public void odczytyZmiana() {
        setChanged();
        notifyObservers();
    }

    public void ustawOdczyt(float temp, float wilgotnosc, float cisnienie) {
        this.temp = temp;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    public float getTemp() {
        return temp;
    }

    public float getWilgotnosc() {
        return wilgotnosc;
    }

    public float getCisnienie() {
        return cisnienie;
    }
}

