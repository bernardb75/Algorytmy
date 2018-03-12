package WzorceProjektowe.WzorzecFasada.Ubior.Ubrania;

public class Czapka implements InterfaceUbieranie {

    @Override
    public void ubierzSie() {
        System.out.println("Zakladam czapke");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdejmuje czapke");
    }
}
