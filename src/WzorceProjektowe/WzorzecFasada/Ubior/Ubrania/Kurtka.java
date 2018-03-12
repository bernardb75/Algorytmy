package WzorceProjektowe.WzorzecFasada.Ubior.Ubrania;

public class Kurtka implements InterfaceUbieranie {
    

    @Override
    public void ubierzSie() {
        System.out.println("Zakladam kurtke");

    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdejmuje kurtke");
    }
}
