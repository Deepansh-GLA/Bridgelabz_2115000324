import java.util.*;
class Lev02que4{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                System.out.println("Input number :");
		int num= input.nextInt();
		if(num>=1){
			System.out.println("The sum of"+num+" natural numbers is="+(num * (num+1) / 2));
		}
		else{
			System.out.println("The number "+num+" is not a natural number");
		}
		

	}
}
