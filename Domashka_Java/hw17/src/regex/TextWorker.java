package regex.operations;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextWorker {
    String text = "Determine how many fucking times each word, that occurs in the text, is repeated in the  text.";

    public void LiteralChanger() {
        int k = 2;
        char symbol = '#';
        System.out.println(text.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", k - 1), "$1" + symbol));
    }

    public void PunctuationMarkFounder() {
        Pattern pat = Pattern.compile("([?,.!:;])");
        Matcher mat = pat.matcher(text);
        int counter = 0;

        while (mat.find()) {
            counter++;
            System.out.println(counter + mat.group());
        }
    }

    public String FirstAndLastAlike() {
        Pattern pat = Pattern.compile("\\b(([\\w])[\\w]*\\2)");
        Matcher mat = pat.matcher(text);
        StringBuilder result = new StringBuilder();
        while (mat.find()) {
            result.append(mat.group() + " ");
        }
        return result.toString();
    }

    public void WordsCounter() {

        String[] words = text.replaceAll("[.,]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for (String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}