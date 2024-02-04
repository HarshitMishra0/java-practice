public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        
    }

    static int fact(int n){
        int factorial = 0;
         
        if(n == 1){
            return 1;
        }else{
            factorial = n* fact(n-1);
        }
        return factorial;
    }
}
