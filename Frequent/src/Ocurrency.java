import java.util.*;
import java.io.*;

public class Ocurrency {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Integer> frequencies = new TreeMap<String, Integer>();
        Scanner scanner = new Scanner(new File("/Users/armanddemiraj/Desktop/Assignment33/Frequent/src/lyrics.txt"));
        while (scanner.hasNext()) {
            String word = frequent(scanner.next());
            Integer count = frequencies.get(word);
            if (count == null) {
                count = 1;
            } else {
                count = count + 1;

            }
            frequencies.put(word, count);
        }

        for (String key : frequencies.keySet()) {
            System.out.println(frequencies.get(key)+": "+key);



        }

    }


    public static String frequent(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                result = result + c;
            }
        }
        return result.toLowerCase();
    }
}