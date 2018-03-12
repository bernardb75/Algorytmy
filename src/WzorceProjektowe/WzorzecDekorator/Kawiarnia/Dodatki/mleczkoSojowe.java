package WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class mleczkoSojowe extends SkladnikiDekorator {
    Napoj napoj;

    public mleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " z mlekiem sojowym";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.25;
    }
}
