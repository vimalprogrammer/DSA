// Problem Description

// You are given an integer array A of size N.
// You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
// Find and return the maximum possible sum of the B elements that were removed after the B operations.
// NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
// Remove 3 elements from front and 0 elements from the back, OR
// Remove 2 elements from front and 1 element from the back, OR
// Remove 1 element from front and 2 elements from the back, OR
// Remove 0 elements from front and 3 elements from the back.

// Problem Constraints
// 1 <= N <= 105
// 1 <= B <= N
// -103 <= A[i] <= 103

// Input Format
// First argument is an integer array A.
// Second argument is an integer B.

// Output Format
// Return an integer denoting the maximum possible sum of elements you removed.

// Example Input
// Input 1:
//  A = [5, -2, 3 , 1, 2]
//  B = 3

// Input 2:
//  A = [ 2, 3, -1, 4, 2, 1 ]
//  B = 4

// Example Output
// Output 1:
//  8
// Output 2:
//  9

// Example Explanation
// Explanation 1:
//  Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
// Explanation 2:
//  Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9

public class PickFromBothSides 
{
    // static int prefixsum[];
    // public int solve(int[] A, int B) 
    // {
    //     prefixsum = new int[A.length];
    //     prefixsum[0]=A[0];
        
    //     for(int i=1;i<A.length;i++)
    //     {
    //         prefixsum[i]=prefixsum[i-1]+A[i];
    //     }
    //     if(B==A.length) return prefixsum[A.length-1];

    //     int maxsum=Integer.MIN_VALUE;
    //     for(int i=0;i<=B;i++)
    //     {
    //       maxsum=Math.max(maxsum,removefront(i)+removeback(B-i));
    //     }
    //     return maxsum;
    // }
    // public static int removefront(int count)
    // {
    //     if(count>0) return prefixsum[count-1];
    //     return 0;
    // }
    // public static int removeback(int count)
    // {
    //     if(count <1) return 0;
    //     int n=prefixsum.length-1;
    //     return (prefixsum[n]-prefixsum[n-count]);

    // }

    //VS
	public int solve(int[] A, int B) 
    {
        int n = A.length;
        int[] prefixSum = new int[n], suffixSum = new int[n];
        prefixSum[0] = A[0];
        for(int i=1;i<n;i++)
        {
            prefixSum[i] = prefixSum[i-1]+A[i];
        }
        suffixSum[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffixSum[i] = suffixSum[i+1]+A[i];
        }

        int ans = Math.max(prefixSum[B-1], suffixSum[n-B]);
        for(int i=1;i<B;i++)
        {
            int x = prefixSum[i-1];
            int y = suffixSum[n-B+i];
            ans = Math.max(ans, x+y);
        }
        return ans;
    }
}
