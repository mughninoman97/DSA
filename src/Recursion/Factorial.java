
//💡 **Question 3**
//
//        ****Given a positive integer, N. Find the factorial of N.
//        **Example 1:**
//        Input: N = 5
//        Output: 120


package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        int num = s.nextInt();

        System.out.println(factorialnum(num));
    }

    public static int factorialnum(int n){
    //base case
        if(n <= 1)
            return 1;

        return n* factorialnum(n-1);

    }
}
