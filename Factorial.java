import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int a = sc.nextInt();

        System.out.println(fact(a));
    }

    static int fact(int a){

        int b = 1;

        for(int i=1; i<=a; i++){
            b = b *i; 
        }

        return b;
    }
    
}
