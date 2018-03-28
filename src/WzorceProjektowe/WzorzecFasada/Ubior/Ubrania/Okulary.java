package WzorceProjektowe.WzorzecFasada.Ubior.Ubrania;

public class Okulary implements InterfaceUbieranie {
    @Override
    public void ubierzSie() {
        System.out.println("Zakładam okulary");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdejmuję okulary");
    }
}
