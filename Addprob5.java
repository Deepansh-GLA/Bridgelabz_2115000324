import java.util.*;

public class Addprob5 {
    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    static void displayResult(boolean result) {
        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String str = getInput();
        boolean result = isPalindrome(str);
        displayResult(result);
    }
}
