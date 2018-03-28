package WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki;


import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Napoj;

public class czekolada extends SkladnikiDekorator {
    Napoj napoj;

    public czekolada(Napoj napoj){
        this.napoj=napoj;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis()+" z czekolada";
    }

    @Override
    public double koszt() {
        return 0.20+napoj.koszt();
    }
}
