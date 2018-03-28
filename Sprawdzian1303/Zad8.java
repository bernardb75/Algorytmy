import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./src/input.in"));

        int sentenceId = 1;
        int words = 0;
        HashMap<Integer, Integer> wordsInSentence = new HashMap<>();

        while (sc.hasNext()){
            String[] spittedSentence = sc.nextLine().split(" ");
            for (int i = 0; i < spittedSentence.length; i++) {
                if(spittedSentence[i].contains(".") ||
                        spittedSentence[i].contains("!") ||
                        spittedSentence[i].contains("?")){
                    words++;
                    wordsInSentence.put(sentenceId, words);
                    words = 0;
                    sentenceId++;
                }
                else{
                    words++;
                }
            }
        }
        for (Integer key : wordsInSentence.keySet()) {
            System.out.println("Zdanie: " + key + " liczba wyrazów " + wordsInSentence.get(key));
        }

    }
}
