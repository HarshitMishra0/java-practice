import java.util.Scanner;

public class NumberOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the operand to perform the operation between the numbers you provided: ");
        char c = sc.next().charAt(0);

        if(c=='+'){
            System.out.println("The result is: "+ (a + b));
        }else if(c == '-'){
            System.out.println("The result is: "+ (a - b));
        }else if(c == '*'){
            System.out.println("The result is: "+ (a * b));
        }else if(c == '/'){
            System.out.println("The result is: "+ (a / b));
        }else if(c == '%'){
            System.out.println("The result is: "+ (a % b));
        }else{
            System.out.println("Invalid Operand");
        }


    }
    
}
