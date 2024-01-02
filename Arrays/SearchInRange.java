public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {2,5,6,2,5,7,9,11,13};
        int start = 3;
        int end = 7;
        int target = 7;
        range(arr, start, end, target);
        
    }
    static void range(int[] arr, int start, int end, int target){
        for(int i=start; i<=end; i++ ){
            if(arr[i]==target){
                System.out.println("The element is found at the index: "+ i);
                
            }
        }
    }
    
}
