

public class Counting_Occurence {

    public static void main(String[] args) {

        int n = 394803;

        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem==3){
                count++;
            }
            n = n/10;
        }

        System.out.println("The number of occurence of 3 is: " + count);
    }
    
}
