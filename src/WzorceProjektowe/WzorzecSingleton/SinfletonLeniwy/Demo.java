package WzorceProjektowe.WzorzecSingleton.SinfletonLeniwy;

public class Demo {
    public static void main(String[] args) {
        Singleton x = Singleton.pobierzInstancje();
        x.wyswietlKomunikat();
    }
}
