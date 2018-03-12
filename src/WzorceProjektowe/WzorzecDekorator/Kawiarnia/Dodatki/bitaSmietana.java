package WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class bitaSmietana extends SkladnikiDekorator {
    Napoj napoj;

    public bitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " z bita smietana";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.15;
    }
}
