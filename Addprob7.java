import java.util.*;

public class Addprob7 {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static void calculateAndDisplayGcdLcm(int a, int b) {
        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);
        System.out.println("GCD: " + gcdValue);
        System.out.println("LCM: " + lcmValue);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        calculateAndDisplayGcdLcm(a, b);
    }
}
