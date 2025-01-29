import java.util.*;

public class Addprob6 {
    static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static void displayResult(int result) {
        System.out.println("Factorial: " + result);
    }

    public static void main(String[] args) {
        int n = getInput();
        int result = calculateFactorial(n);
        displayResult(result);
    }
}
