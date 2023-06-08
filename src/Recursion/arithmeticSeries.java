package Recursion;

public class arithmeticSeries {
    public static void main(String[] args) {
        System.out.println( APseries(2,1,5));
    }

    static int APseries(int a, int d, int n){
        int tn = a + (n-1)*d;
        return tn;
    }
}
