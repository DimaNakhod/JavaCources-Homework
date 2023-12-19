package runner;

import regex.operations.TextWorker;

public class Runner {

    public static void main(String[] args) {

        TextWorker lit = new TextWorker();
        System.out.println("Put # instead every second letter ");
        lit.LiteralChanger();
        System.out.println("All punctuation marks:");
        lit.PunctuationMarkFounder();
        System.out.println("Words that begin and end with the same letter: ");
        System.out.println(lit.FirstAndLastAlike());
        System.out.println("How many times each word is repeating: ");
        lit.WordsCounter();
    }
}
