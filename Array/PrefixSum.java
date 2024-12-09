// Problem Description

// Given an array A of N integers. Construct prefix sum of the array in the given array itself.

// Input Format
// Only argument A is an array of integers.

// Output Format
// Return an array of integers denoting the prefix sum of the given array.

// Example Input
// Input 1:
// A = [1, 2, 3, 4, 5]

// Input 2:
// A = [4, 3, 2]

// Example Output
// Output 1:
// [1, 3, 6, 10, 15]

// Output 2:
// [4, 7, 9]

public class Solution {
    // public int[] solve(int[] prefixSum) 
    // {
    //     for(int i=1;i<prefixSum.length;i++)
	//     {
	//         prefixSum[i]=prefixSum[i]+prefixSum[i-1];
	//     }
    //     return prefixSum;
    // }

    public int[] solve(int[] pF)
    {
        int len = pF.length;
        for(int i=1;i<len;i++)
        {
            pF[i] = pF[i-1]+pF[i]; 
        }
        return pF;
    }
}
