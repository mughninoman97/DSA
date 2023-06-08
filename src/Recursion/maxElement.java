//💡 **Question 5**
//
//        Given an array of integers **arr**, the task is to find maximum element of that array using recursion.
//        **Example 1:**
//        Input: arr = {1, 4, 3, -5, -4, 8, 6};
//        Output: 8
//        **Example 2:**
//        Input: arr = {1, 4, 45, 6, 10, -8};
//        Output: 45

package Recursion;

public class maxElement {
    public static void main(String[] args) {
        int[] arr ={1,4,6,74,5};
        int max = 0;
        System.out.println(maxelement(arr, 0));

    }

    static int maxelement(int[] arr, int index){
        //base
        if(index == arr.length -1)
            return arr[index];

        int misa = maxelement(arr, index+1);
        if(misa > arr[index]){
        return misa;
        }else{
            return arr[index];
        }
    }



}
