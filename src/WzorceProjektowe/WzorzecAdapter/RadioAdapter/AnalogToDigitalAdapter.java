package WzorceProjektowe.WzorzecAdapter.RadioAdapter;

public class AnalogToDigitalAdapter implements DigitalSignal {
    AnalogSignal radioFm;

    public AnalogToDigitalAdapter(AnalogSignal analogSignal) {
        radioFm = analogSignal;
    }

    @Override
    public int[] getDigital() {
        int noOfDigital = radioFm.getAnalog().length / 8;
        int[] temp=new  int[noOfDigital];

        int sum=0;
        int counter=0;
        for (int i = 0; i <noOfDigital ; i++) {
            for (int j = 0; j <8 ; j++) {
                if (radioFm.getAnalog()[counter]>1.0)
                    sum+=Math.pow(2.0,j);
                counter++;
            }
            temp[i]=sum;
            sum=0;
        }return temp;
    }

    @Override
    public void setDigital(int[] digital) {
//nie ma mozliwosci uzyskania sygnalu analogowego z cyfrowego
    }

    @Override
    public void printDigital() {
        int[] digits = getDigital();
        for (int i : digits) {
            System.out.println(i);
        }

    }
}
