package WzorceProjektowe.WzorzecAdapter.RadioAdapter;

public class DigitalRadio implements DigitalSignal {
    private int[] digit;

    public DigitalRadio(int signalLength) {
        digit = new int[signalLength];
    }

    @Override
    public int[] getDigital() {
        return digit;
    }

    @Override
    public void setDigital(int[] digital) {
        this.digit = digital;
    }

    @Override
    public void printDigital() {
        for (int i : digit) {
            System.out.printf("%d ", i);
        }

    }
}
