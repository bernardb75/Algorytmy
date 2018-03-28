package WzorceProjektowe.WzorzecFasada.Ubior;

import WzorceProjektowe.WzorzecFasada.Ubior.Ubrania.InterfaceUbranie;

public class StrategiaZimowa {
    private InterfaceUbranie interfaceUbranieZimowe;

    public StrategiaZimowa(InterfaceUbranie interfaceUbranie){
        interfaceUbranieZimowe=interfaceUbranie;
    }
    public void ubierzZimowe(){
        interfaceUbranieZimowe.zalozUbranie();
    }
    public void zdejmijZimowe(){
        interfaceUbranieZimowe.zdejmijUbranie();
    }

    public void setInterfaceUbranie(InterfaceUbranie interfaceUbranie) {
        this.interfaceUbranieZimowe = interfaceUbranie;
    }
}
