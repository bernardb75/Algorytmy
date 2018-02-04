package Zajecia2801.Sortowania.ZbiorZadan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ZliczLiteryZpliku {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "/Users/Lenovo/Desktop/kursJavaKOMIN/File.txt");

        Scanner sc = new Scanner(file);

        HashMap<String, Integer> wystapienieLitera = new HashMap<>();
        wystapienieLitera.put("a", 0);
//        wystapienieLitera.put("ą", 0);
        wystapienieLitera.put("b", 0);
        wystapienieLitera.put("c", 0);
//        wystapienieLitera.put("ć", 0);
        wystapienieLitera.put("d", 0);
        wystapienieLitera.put("e", 0);
        wystapienieLitera.put("f", 0);
        wystapienieLitera.put("g", 0);
        wystapienieLitera.put("h", 0);
        wystapienieLitera.put("i", 0);
        wystapienieLitera.put("j", 0);
        wystapienieLitera.put("k", 0);
        wystapienieLitera.put("l", 0);
        wystapienieLitera.put("m", 0);
        wystapienieLitera.put("n", 0);
        wystapienieLitera.put("o", 0);
        wystapienieLitera.put("p", 0);
        wystapienieLitera.put("q", 0);
        wystapienieLitera.put("r", 0);
        wystapienieLitera.put("s", 0);
//        wystapienieLitera.put("ś", 0);
        wystapienieLitera.put("t", 0);
        wystapienieLitera.put("u", 0);
        wystapienieLitera.put("v", 0);
        wystapienieLitera.put("w", 0);
        wystapienieLitera.put("z", 0);
//        wystapienieLitera.put("ź", 0);
//        wystapienieLitera.put("ż", 0);


        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                String letter = line.substring(i, i + 1);
                wystapienieLitera.replace(letter, wystapienieLitera.get(letter) + 1);
            }
        }
        for (String litera : wystapienieLitera.keySet()) {
            if (wystapienieLitera.get(litera)>0)
            System.out.printf("%s : %d\n", litera, wystapienieLitera.get(litera));
        }
    }

}
