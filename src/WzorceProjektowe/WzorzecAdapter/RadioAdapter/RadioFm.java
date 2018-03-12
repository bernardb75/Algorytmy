package WzorceProjektowe.WzorzecAdapter.RadioAdapter;

import java.util.Random;

public class RadioFm implements AnalogSignal {
    private double[] analog;

    public RadioFm(int noSample){
        analog=new double[noSample];
        Random random=new Random();
        analog=random.doubles(noSample,0,2.0).toArray();
    }


    @Override
    public double[] getAnalog() {
        return analog;
    }

    @Override
    public void setAnalog(double[] analog) {
        this.analog = analog;
    }

    @Override
    public void printAnalog() {
        for (double i :analog) {
            System.out.println(i);
        }

    }
}
