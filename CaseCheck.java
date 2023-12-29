import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet to check its case: ");
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");

        }else{
            System.out.println("Your input is not an aphabet!");
        }
    }
}
