public class CountZeros {

    public static void main(String[] args) {
        
        System.out.println(counts(28030, 0));


    }

    static int counts(int n, int count){

        if(n==0){
            return count;

        }

        int rem = n%10;

        if(rem==0){
            return counts(n/10,count +1);
        }

        return counts(n/10, count);


    }
    
}
