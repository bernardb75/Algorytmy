package WzorceProjektowe.WzorzecFasada.Ubior.Ubrania;

public class Koszule implements InterfaceUbieranie{
    @Override
    public void ubierzSie() {
        System.out.println("Ubieram koszulę");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zciągam koszule");
    }
}
