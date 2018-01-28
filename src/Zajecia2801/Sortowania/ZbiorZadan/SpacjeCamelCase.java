package Zajecia2801.Sortowania.ZbiorZadan;

public class SpacjeCamelCase {
    public static void main(String[] args) {
        String sms = "Dziasiaj jest czawatek," +
                "A jutro bedzie piatek.";

        char[] smsArr = sms.toCharArray();
        boolean toUpper = false;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < smsArr.length; i++) {
            if(smsArr[i] != ' '){
                if(toUpper) {
                    sb.append(Character.toUpperCase(smsArr[i]));
                    toUpper = false;
                }
                else{
                    sb.append(smsArr[i]);
                }
            }
            else
                toUpper = true;
        }
        System.out.println(sb.toString());

    }
}
