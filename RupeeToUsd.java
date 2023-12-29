import java.util.Scanner;

public class RupeeToUsd{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of currency in inr: ");
        double a = sc.nextDouble();

        double b = (a/83.3);

        System.out.println("The value of your currency in USD is: "+ b +"$");
    }
}