package WzorceProjektowe.WzorzecObserwator.StacjaPogodowa;

public interface Podmiot {
    void dodajNaListeSusbskrybentow(Obserwator obserwator);
    void usunZListySybskrybentow(Obserwator obserwator);
    void przekazAkrtualizacje();

}
