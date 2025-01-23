import java.util.Scanner;

class Lev03que8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1 = input.nextInt();
        int height1 = input.nextInt();
        int age2 = input.nextInt();
        int height2 = input.nextInt();
        int age3 = input.nextInt();
        int height3 = input.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);
    }
}
