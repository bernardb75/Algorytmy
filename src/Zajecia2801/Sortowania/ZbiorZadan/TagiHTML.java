package zadanieDomowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TagiHTML {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(
                "/Users/Lenovo/Desktop/kursJavaKOMIN/html.txt");

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String val = line.substring(line.indexOf("<"),
                    line.indexOf(">") + 1).toUpperCase();
            String valEnd = line.substring(line.lastIndexOf("<"),
                    line.lastIndexOf(">") + 1).
                    toUpperCase();
            int valInt = line.length() - (val.length() + valEnd.length());

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(val);
            if (valInt > 0)
                if (line.length()>val.length()){
                    String midleString =line.substring(val.length(),line.length()-valEnd.length());
                    stringBuilder.append(midleString);
                }
            if (line.length() > val.length()) {
                stringBuilder.append(valEnd);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}








