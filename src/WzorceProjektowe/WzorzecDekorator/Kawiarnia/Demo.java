package WzorceProjektowe.WzorzecDekorator.Kawiarnia;

import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki.czekolada;
import WzorceProjektowe.WzorzecDekorator.Kawiarnia.Dodatki.mleko;
import WzorceProjektowe.WzorzecDekorator.Kawiarnia.SkladnikiBazowe.Bezkofeinowa;

public class Demo {
    public static void main(String[] args) {
        Napoj bezkofeinowa=new Bezkofeinowa();
        Napoj czekolada=new czekolada(bezkofeinowa);
        Napoj mleko=new mleko(czekolada);
        System.out.println(mleko.getOpis());
        System.out.println(mleko.koszt());
        System.out.println("--------");
        Napoj bezkofeinowaZMlekiem=new mleko(new Bezkofeinowa());
        System.out.println(bezkofeinowaZMlekiem.getOpis());
        System.out.println(bezkofeinowaZMlekiem.koszt());
    }
}
