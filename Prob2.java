import java.util.*;
class Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        System.out.println("Maximum number: " + findMax(a, b, c));
    }
    
    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
