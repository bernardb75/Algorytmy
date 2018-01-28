package Zajecia2801.Sortowania.ZbiorZadan;

public class CamelCaseOdwroc {
    public static void main(String[] args) {
        String sms = "DziasiajJestCzawatek," +
                "AJutroBedziePiatek.";

        char[] smsArr = sms.toCharArray();

        for (int i = 0; i < smsArr.length; i++) {
            if (Character.isUpperCase(smsArr[i]) && i != 0) {
                System.out.print(" ");
                System.out.print(Character.toLowerCase(smsArr[i]));

            } else System.out.print(smsArr[i]);

        }
    }
}
