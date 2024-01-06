import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digit number: ");
        int a = sc.nextInt();

        armstrong(a);
    }

    static void armstrong(int a){
        int b = a;

        int sum = 0;
        while(b>0){

            int rem = b % 10;

            sum = sum + rem*rem*rem;

            b = b/10;

        }

        if(sum == a){
            System.out.println("The number you entered is an Armstrong Number!");
        }else{
            System.out.println("The number you entered is not an armstrong number!");
        }

        }

    }
    

