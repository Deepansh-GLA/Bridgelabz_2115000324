import java.util.Scanner;

class Lev03Que1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Year is below 1582");
        }
    }
}
