package Zajecia0302.Kopiec;

public class kopiecDemo {
    public static void main(String[] args) {
        kopiec kop=new kopiec();
        kop.addElementToKopiec(15);
        kop.addElementToKopiec(24);
        kop.addElementToKopiec(1);
        kop.addElementToKopiec(123);
        kop.addElementToKopiec(6);

//        kop.deleteElement();
//        kop.printAllElements();

    kop.rozbiezKopiec();
    }
}
