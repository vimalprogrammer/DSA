Problem Description

You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

Input Format
First arugment is an array A .

Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.

Example Input
Input 1:
A = [-7, 1, 5, 2, -4, 3, 0]

Input 2:
A = [1, 2, 3]

Example Output
Output 1:
3

Output 2:
-1

public class Solution {
    // public int solve(int[] A) 
    // {
    //     long prefarr[]=prefixSum(A);
    //     for(int i=0;i<A.length;i++)
    //     {
    //         long leftsum=0;
    //         long rightsum=0;
    //         if(i==0)
    //         {
    //             rightsum= prefixQuery(prefarr, 1,A.length-1);
    //         }
    //         else
    //         {
    //             leftsum = prefixQuery(prefarr,0,i-1);
    //             rightsum= prefixQuery(prefarr,i+1,A.length-1);
    //         }

    //         if(leftsum == rightsum)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static long prefixQuery(long arr[],int left,int right)
	// {
    //             if(right <=0)
    //              return 0;
	//            if(left <=0)
	//            return arr[right];
	//            return arr[right]-arr[left-1];
	// }

    // public static long[] prefixSum(int arr[])
	// {
	//     long prefixSum[] = new long[arr.length];
	//     prefixSum[0]=arr[0];
	//     for(int i=1;i<prefixSum.length;i++)
	//     {
	//         prefixSum[i]=arr[i]+prefixSum[i-1];
	//     }
	//     return prefixSum;
	// }

//VS
    public int solve(int[] A)
    {
        int totalSum =0;
        int len = A.length;
        for(int i=0;i<len;i++)
        {
            totalSum+=A[i];
        }
        int leftSideSum = 0;
        for(int i=0;i<len;i++)
        {
            totalSum-=A[i];
            if(totalSum == leftSideSum)
                return i;

            leftSideSum +=A[i];
        }
        return -1;
    }
}
