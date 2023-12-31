import java.util.Scanner;

public class MinNmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max(a,b,c);
        min(a,b,c);

    }

    static void max(int a, int b, int c){
        int max = 0;

        if(a>=b && a>=c){
            max = a;
        }else if(b>=a && b>=c){
           max = b;
        }else if(c>=a && c>=b){
           max = c;
        }
        System.out.println("The maximum number is: "+ max);
    }
    
    static void min(int a, int b, int c){
        
        if(a<=b && a<=c){
            System.out.println("The smallest number is: "+ a);
        }else if(b<=a && b<=c){
            System.out.println("The smallest number is: "+ b);
        }else if(c<=a && c<=b){
            System.out.println("The smallest number is: "+ c);
        }

    }
    
}
