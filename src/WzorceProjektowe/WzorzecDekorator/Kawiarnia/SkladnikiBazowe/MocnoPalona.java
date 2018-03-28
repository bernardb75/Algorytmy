package WzorceProjektowe.WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class MocnoPalona extends Napoj {
    @Override
    public String getOpis() {
        return "Kawa Mocno Palona";
    }

    @Override
    public double koszt() {
        return 15.00;
    }
}
