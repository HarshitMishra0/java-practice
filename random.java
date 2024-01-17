import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =1;
        int oddNumSum = 0;
        int eveNumSum = 0;

        while( a!=0){
            System.out.println("Enter a number to add, if you want to exit the loop just enter 0!");
            a = sc.nextInt();
            if(a==0){
                break;
            } else if(evenOdd(a)==true){
                eveNumSum = eveNumSum + a;
            }else if(evenOdd(a)== false){
                oddNumSum = oddNumSum + a;

            }

        }

        System.out.println("The sum of even numbers is "+eveNumSum +" and the sum of the odd numbers is "+oddNumSum);

        
    }

    static boolean evenOdd(int n){

        if(n%2==0 || n==0){
            return true;
        }
        return false;
    }
    
}
