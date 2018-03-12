package WzorceProjektowe.WzorzecObserwator.StacjaPogodowa;

import WzorceProjektowe.WzorzecObserwator.StacjaPogodowa.Wyswietlacze.WarunkiBiezace;

public class Demo {

        public static void main(String[] args) {
            DanePogodowe dp=new DanePogodowe();
            WarunkiBiezace wb=new WarunkiBiezace(dp);

            dp.ustawOdczyt(-3.0f,34.5f,1024);
            wb.wyswietlElement();

            dp.ustawOdczyt(-2.0f,40f,1024);
            wb.wyswietlElement();
        }
    }

