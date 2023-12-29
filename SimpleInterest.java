import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        System.out.print("Enter your prinicpal amount: "); 
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();

        System.out.print("Enter your time in years: "); 
        double time = sc.nextDouble();

        System.out.print("Enter your annual interest rate: "); 
        double rate = sc.nextDouble();

        double simpleInterest = (principal*rate*time)/100;

        System.out.println("Your calculated Simple Interest is: "+ simpleInterest);


    }
    
}
