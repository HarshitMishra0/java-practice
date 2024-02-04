public class From1toN {
    public static void main(String[] args) {
        na(5);
        

    }

     static void na(int n){
        if(n == 0){
            return;
        }

        
        na(n-1);
        System.out.println(n);
    }
}
