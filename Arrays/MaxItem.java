import java.util.Arrays;
import java.util.Scanner;

public class MaxItem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements you want for the array: ");
        int elements = sc.nextInt();
        int[] arr = new int[elements];

        System.out.println("Enter all the elements in the array: ");

        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();   
        }

        System.out.println("The array you entered is as follow: " + Arrays.toString(arr));

        max(arr);
    }

    static void max(int arr[]){
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("The maximum element in this array is: "+ max);
    }
    
}
