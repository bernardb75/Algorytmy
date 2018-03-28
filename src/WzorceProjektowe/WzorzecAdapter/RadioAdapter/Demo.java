package WzorceProjektowe.WzorzecAdapter.RadioAdapter;

public class Demo {
    public static void main(String[] args) {
        AnalogSignal radioFm=new RadioFm(24);
        DigitalSignal radioFmAdapter=new AnalogToDigitalAdapter(radioFm);

        radioFmAdapter.printDigital();
    }
}
