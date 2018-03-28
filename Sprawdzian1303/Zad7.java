public class Zad7 {
    public static void main(String[] args) {
        rev("Test");
    }

    public static void rev(String str){
        if(str.length() == 1){
            System.out.println(str);
        }
        else {
            rev(str.substring(1, str.length()));
            System.out.println(str.substring(0, 1));
        }
    }
}
