package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

int [][] nums = {
        {10,20,30},
        {5,10,15}
};

// nums.length == 2
        // nums[0].length + nums[1].length --> netter then 6, but still not dynamic
        // to count the total number od element i will need to loop

        int size =0;

        for (int[] eachArray : nums){
            size += eachArray.length;
        }

// purpose of this loop was to count the total number of elements, which should be the size of the merged array

        int[] merged = new int[size];
        int indexToStore = 0;

        for(int[] eachArray : nums){
            for(int eachNum : eachArray){
                merged[indexToStore++] = eachNum; // assign the eachNum to the merged array
                //System.out.println(Arrays.toString(merged));
            }
        }

        System.out.println(Arrays.toString(merged));





    }
}
/*
int [] a = new int
a[0] = 5;
a[i] = value
 */