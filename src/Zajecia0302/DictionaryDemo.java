package Zajecia0302;

import java.util.HashMap;


public class DictionaryDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> dzieci=new HashMap<>();

        int test=5;
        String testValue="55";

        dzieci.put(1,"Kowalski");
        dzieci.put(2,"Antkowiak");
        dzieci.put(test,testValue);

        String element=dzieci.get(1);

//        dzieci.isEmpty();
//        dzieci.keySet();

        for (Integer key:dzieci.keySet()) {
            System.out.printf("%d:\n", dzieci.get(key));
        }

    }
}
