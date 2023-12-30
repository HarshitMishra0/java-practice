import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to check whether it's prime or not: ");
        int a = sc.nextInt();
        checkPrime(a);
    }

    static void checkPrime(int a) {
        if (a <= 1) {
            System.out.println("Not a prime number!");
            return; 
        }

        int c;

        for (c = 2; c * c <= a; c++) {
            if (a % c == 0) {
                System.out.println("Not a prime number!");
                return; 
            }
        }

        if (c * c > a) {
            System.out.println("This number is a prime number!");
        }
    }
}
