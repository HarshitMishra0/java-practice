import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get its fibonacci series: ");
        int a = sc.nextInt();

        int firstTerm = 0; int secondTerm = 1;

        for(int i=1; i<=a; i++){
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm= nextTerm;
        }
    }
    
}
