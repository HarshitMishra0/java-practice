import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("The number "+ a + " is Even!!");
        }else{
            System.out.println("The number "+a + " id Odd!!");
        }
    }
}