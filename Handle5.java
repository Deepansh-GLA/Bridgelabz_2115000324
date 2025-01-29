import java.util.*;

public class Handle5 {
    static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Longest word: " + findLongestWord(sentence));
    }
}
