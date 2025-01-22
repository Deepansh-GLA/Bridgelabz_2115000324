import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f%n", discount);
        System.out.printf("The final discounted fee is INR %.2f%n", finalFee);

        
    }
}


