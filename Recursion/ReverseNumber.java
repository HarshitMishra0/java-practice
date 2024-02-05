public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(rev(1232));
    }

    static int rev(int n){
        int sum =0;
        if(n==0){
            return 0;
        }
        int rem =(n%10); 
        sum = sum*10 + rem;

        return sum*10 + rev(n/10); 
    }
}
