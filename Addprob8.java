import java.util.*;

public class Addprob8 {
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " Celsius");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius = " + celsiusToFahrenheit(celsius) + " Fahrenheit");
    }
}
