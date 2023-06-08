package Recursion;

public class sumOfdigits {
    public static void main(String[] args) {
        System.out.println( digitsSum(342432));
    }

    public static int  digitsSum(int n){
        //base
        if(n/10==0)
            return n;
        int rem = n %10;
        return rem+ digitsSum(n/10);
    }
}
