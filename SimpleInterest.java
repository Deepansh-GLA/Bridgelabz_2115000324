import java.util.Scanner;

class SimpleInterest {
	public double calculateSimpleInterest(double principal, double rate, double time) {
		return (principal * rate * time) / 100;
    }

	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	double principal = scanner.nextDouble();
        	double rate = scanner.nextDouble();
        	double time = scanner.nextDouble();
        	SimpleInterest si = new SimpleInterest();
        	double interest = si.calculateSimpleInterest(principal, rate, time);
		System.out.println(interest);
	}
}
