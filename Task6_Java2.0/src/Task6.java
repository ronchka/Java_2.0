import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class Task6 {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("test");
        String line;
        try  {
            Scanner scanner = new Scanner(file);
            line = scanner.nextLine();
            String[] words = line.split(" ");
            Arrays.sort(words);
            System.out.println(Arrays.toString(words));
            HashMap <String, Integer> wordToCount = new HashMap<>();
            for (String word : words) {
                if (!wordToCount.containsKey(word)) {
                    wordToCount.put(word, 0);
                }
                wordToCount.put(word, wordToCount.get(word) + 1);
            }
            for (String word : wordToCount.keySet()) {
                System.out.println(word + " встречается " + wordToCount.get(word) + " раз");
            }
            int count = 0;
            String oftenWord = null;
            for (String word : wordToCount.keySet()) {
                if (count < wordToCount.get(word)) {
                    count = wordToCount.get(word);
                    oftenWord = word;
                }
            }
            System.out.println("Самое повторяющееся слово: " + oftenWord + " (встречается " + count + " раз)");
        }
        catch (NoSuchElementException e){
            System.out.println("Файл пустой");
        }
    }
}
