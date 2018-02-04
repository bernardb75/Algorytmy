package Zajecia0302;


import java.util.HashMap;

public class SzyfrCezaraDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>szyfrCezara=new HashMap<>();
        szyfrCezara.put(0,"A");
        szyfrCezara.put(1,"B");
        szyfrCezara.put(2,"C");
        szyfrCezara.put(3,"D");

        System.out.print(szyfrCezara.get(3));
        szyfrCezara.remove(0);
    }
}
