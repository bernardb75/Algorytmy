package WzorceProjektowe.WzorzecSingleton.SingletonWatkowy1;

public class Singleton {
    private static Singleton unikalneInstancje;

    private Singleton() {
    }

    public static synchronized Singleton pobierzInstancje() {
        if (unikalneInstancje == null)
            unikalneInstancje = new Singleton();
        return unikalneInstancje;
    }
}
