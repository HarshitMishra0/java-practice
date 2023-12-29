import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Hi "+ a +"!! Good Morning!!");
    }
    
}
