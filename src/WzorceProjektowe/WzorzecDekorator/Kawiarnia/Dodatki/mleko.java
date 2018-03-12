package WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class mleko extends SkladnikiDekorator {
    Napoj napoj;

    public mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + " z mlekiem";
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.45;
    }
}
