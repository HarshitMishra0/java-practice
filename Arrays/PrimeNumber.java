import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int counter = 0;

        for(int i=n-1; i>1; i--){

            if(n%i==0){
                counter = counter +1;
            }

        }

        if(counter>0){
            System.out.println("The number you entered is not a prime number!");
        }else{
            System.out.println("The number you entered is prime!");
        }
    }
    
}
