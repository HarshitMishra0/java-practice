public class Nto1 {
    public static void main(String[] args) {

        na(5);
        

    }

    static void na(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        na(n-1);
    }
    
}
