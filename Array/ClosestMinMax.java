// Problem Description

// Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
// and at least one occurrence of the minimum value of the array.

// Problem Constraints
// 1 <= |A| <= 2000

// Input Format
// First and only argument is vector A

// Output Format
// Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array

// Example Input

// Input 1:
// A = [1, 3, 2]

// Input 2:
// A = [2, 6, 1, 6, 9]

// Example Output
// Output 1:
//  2

// Output 2:
//  3

// Example Explanation
// Explanation 1:
//  Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
// Explanation 2:
//  Take the last 3 elements of the array.

public class ClosestMinMax
{
    // public int solve(int[] A) 
    // {
    //     int minelement = Integer.MAX_VALUE;
    //     int maxelement = Integer.MIN_VALUE;
    //     for(int i:A)
    //     {
    //         minelement=Math.min(minelement,i);
    //         maxelement=Math.max(maxelement,i);
    //     }

    //     if(minelement == maxelement) return 1;

    //     int minindex=-1;
    //     int maxindex=-1;
    //     int length=A.length;
    //     for(int i=0;i<A.length;i++)
    //     {
    //         if(A[i] == minelement)
    //         {
    //             minindex=i;
    //             if(maxindex != -1)
    //             {
    //                 length=Math.min(length,(minindex - maxindex)+1);
    //             }
    //         }
    //         else if(A[i] == maxelement)
    //         {
    //             maxindex=i;
    //             if(minindex != -1)
    //             {
    //                 length=Math.min(length,(maxindex - minindex)+1);
    //             }
    //         }
    //     }
    //     return length;
    // }

    //VS
	public int solve(int[] A)
    {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(A[i]<minimum)
                minimum = A[i];
            if(A[i]>maximum)
                maximum = A[i];
        }
        int max_i = -1, min_i = -1;
        for(int i=n-1;i>=0;i--)
        {
            if(A[i] == minimum)
            {
                min_i = i;
                if(max_i != -1)
                    ans = Math.min(ans, max_i - min_i+1);   
            }
            if(A[i] == maximum)
            {
                max_i = i;
                if(min_i != -1)
                    ans = Math.min(ans, min_i - max_i+1);
            }
        }
        return ans;
    }
}