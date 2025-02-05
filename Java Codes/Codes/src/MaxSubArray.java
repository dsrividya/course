import java.util.*;
public class MaxSubArray {


    public static void subarray(int[] arr) {

        int maxlength = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int max = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                max = max * arr[j];

                maxlength = Math.max(maxlength, max);

                if (arr[j] == 0) { // Reset when encountering zero
                    max = 1;
                }
            }

        }
        System.out.println(maxlength);
    }
    public static void main(String[] args)
    {
            int[] arr= new int[]{1,2,3,4,5,0};
            int[] arr1= new int[]{1,2,-3,0,-4,-5};
            MaxSubArray.subarray(arr);
            MaxSubArray.subarray(arr1);

    }
}
