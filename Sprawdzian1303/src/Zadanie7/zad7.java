package Zadanie7;
public class zad7 {
    public static String rev(String str)
    {
        if (str.length() == 1) return str;
        else return rev(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(rev("rekurencja"));
    }

}
