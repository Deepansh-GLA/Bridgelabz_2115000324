import java.util.*;
class Lev02que3{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.println("Input first number :");
                int num1 = input.nextInt();
                System.out.println("Input second number :");
                int num2 = input.nextInt();
                System.out.println("Input third number :");
                int num3 = input.nextInt();
                if(num1>num2 && num1>num3){
                        System.out.println(" First Number is largest.");
                }
                if(num2>num1 && num2>num3){
                        System.out.println(" Second Number is largest.");
                }
		if(num3>num2 && num3>num1){
                        System.out.println(" Third Number is largest.");
                }


        }
}
