import java.util.*;

public class Handle7 {
    static String toggleCase(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else {
                result += Character.toUpperCase(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Toggled case string: " + toggleCase(str));
    }
}

