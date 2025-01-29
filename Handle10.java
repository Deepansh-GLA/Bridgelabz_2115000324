import java.util.*;

public class Handle10 {
    static String removeCharacter(String str, char ch) {
        return str.replaceAll(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        System.out.println("Modified string: " + removeCharacter(str, ch));
    }
}
