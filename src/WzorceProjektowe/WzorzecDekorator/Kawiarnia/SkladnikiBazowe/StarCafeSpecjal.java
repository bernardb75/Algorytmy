package WzorceProjektowe.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class StarCafeSpecjal extends Napoj {
    @Override
    public String getOpis() {
        return "Specjal";
    }

    @Override
    public double koszt() {
        return 10.00;
    }
}
