import java.util.*;

public class Addprob5 {
    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
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

