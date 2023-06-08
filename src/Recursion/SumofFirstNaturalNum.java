
//💡 **Question 2**
//
//Given a number n, find the sum of the first natural numbers.
//**Example 1:**
//Input: n = 3
//Output: 6

package Recursion;

public class SumofFirstNaturalNum {
    public static void main(String[] args) {
        System.out.println( sumofN(4));

    }

    public static int sumofN(int n){
        //base condition
        if(n==0)
            return n;

        return n+ sumofN(n-1);
    }
}
