import java.util.*;
class Lev02que1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        	int num = input.nextInt();
		if(num%5==0){
			System.out.println("Is the number "+num+" divisible by 5?");
			System.out.println("Yes");
		}
		else{
			System.out.println("Is the number "+num+" divisible by 5?");
                        System.out.println("No");
		}	
	
	}
}
