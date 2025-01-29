import java.util.*;

class Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String response;
        
        while (true) {
            guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            response = scanner.next();
            
            if (response.equals("correct")) break;
            else if (response.equals("high")) high = guess - 1;
            else if (response.equals("low")) low = guess + 1;
        }
        System.out.println("Computer guessed your number!");
    }
}
