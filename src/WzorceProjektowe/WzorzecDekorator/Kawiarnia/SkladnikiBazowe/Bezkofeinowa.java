package WzorceProjektowe.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class Bezkofeinowa extends Napoj {
    @Override
    public String getOpis() {
        return "Kawa bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 11.00;
    }
}
