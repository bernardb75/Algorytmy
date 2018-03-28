package WzorceProjektowe.WzorzecObserwator.WzorzecObserwatorWbudowany.StacjaPogodowa;

import WzorceProjektowe.WzorzecObserwator.WzorzecObserwatorWbudowany.StacjaPogodowa.Wyswietlacze.WarunkiBiezace;

public class Demo {

        public static void main(String[] args) {
            DanePogodowe dp=new DanePogodowe();
            WarunkiBiezace wb=new WarunkiBiezace(dp);

            dp.ustawOdczyt(-3.0f,34.5f,1031);
            wb.wyswietlElement();

            dp.ustawOdczyt(-2.0f,40f,1024);
            wb.wyswietlElement();
        }
    }

