// Problem Description
// Given an integer array A of size N. In one second, you can increase the value of one element by 1.
// Find the minimum time in seconds to make all elements of the array equal.

// Example Input
// A = [2, 4, 1, 3, 2]

// Example Output
// 8

// Example Explanation
// We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.

public class Solution {
    // public int solve(int[] A) 
    // {
    //     int max=1;
    //     for(int i:A)
    //     {
    //         max=Math.max(i,max);
    //     }
    //     int count =0;
    //     for(int i:A)
    //     {
    //         count+=max-i;
    //     }
    //     return count;
    // }

    //VS
    public int solve(int[] A)
    {
        int max = Integer.MIN_VALUE;
        int totalSum = 0;
        for(int i:A)
        {
            max = Math.max(max, i);
            totalSum+=i;
        }
        int n = A.length;
        int finalArrSum = n*max;
        return finalArrSum - totalSum;   
    }
}
