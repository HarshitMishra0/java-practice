import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter the no. of elements you want in your array: ");
        int element = sc.nextInt();
        int[] arr = new int[element];

        System.out.println("Enter all the elements in this array: ");
        
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element which you want to see if it is present in the array or not: ");
        int n = sc.nextInt();
        linearSearch(arr, n);
    }

    static int linearSearch(int[] arr, int n){
       

        for(int i=0; i<arr.length; i++){
            if(arr[i]== n){
                System.out.println("The element is found at index: "+ i);
                return i;
            }
        }
        System.out.println("The element is not present in the array!!");
        return -1;

    }
    
}
