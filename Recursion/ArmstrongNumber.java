import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        
        armsotrong(n);
    
    }

    static void armsotrong(int n){
        int ans = 0;
        int a = n;

        while(n>0){
            int temp = n%10;
            temp = temp*temp*temp;
            ans = temp + ans;
            n = n/10;
        }

        if(ans ==  a){
            System.out.println("The number you entered is an armstrong number!! ");
        }else{
            System.out.println("The number you entered is NOT an armstrong number!!");
        }

        
    }
}
