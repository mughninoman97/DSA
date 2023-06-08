
//💡 **Question 8**
//        Given an array, find a product of all array elements.
//        **Example 1:**
//        Input  : arr[] = {1, 2, 3, 4, 5}
//        Output : 120
//        **Example 2:**
//        Input  : arr[] = {1, 6, 3}
//        Output : 18

package Recursion;

public class productarray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
        System.out.println( productofArray(arr, arr.length-1));
        System.out.println(arr[arr.length-1]);
    }

    static int productofArray(int[] arr, int n){
        if(n == 0)
            return arr[n];

        return arr[n] * productofArray(arr, n-1);
    }


}
