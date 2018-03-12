package WzorceProjektowe.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class Expresso extends Napoj {
    @Override
    public String getOpis() {
        return "Kawa Expresso";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
