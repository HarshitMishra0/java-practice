

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {4,2,5,9,1};

        System.out.println(search(arr,5));
        
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;

        if(target>arr[mid]){
            start = start +1;
        }else if(target<arr[mid]){
            end = end - 1;
        }else{
            return mid;
        }
        return -1;
    }
    
}
