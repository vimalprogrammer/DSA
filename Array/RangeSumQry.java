// Problem Description

// You are given an integer array A of length N.
// You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
// For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
// More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

// Input Format
// The first argument is the integer array A.
// The second argument is the 2D integer array B.


// Output Format
// Return an integer array of length M where ith element is the answer for ith query in B.

// Example Input

// Input 1:
// A = [1, 2, 3, 4, 5]
// B = [[0, 3], [1, 2]]
// Input 2:
// A = [2, 2, 2]
// B = [[0, 0], [1, 2]]

// Example Output
// Output 1:
// [10, 5]
// Output 2:
// [2, 4]

public class RangeSumQry {
    
    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};
        long[] res = rangeSum(A,B);
        for(long i:res)
        {
            System.out.println(i);
        }
    }

    //VS
    public static long[] rangeSum(int[] A, int[][] B)
    {
        int lenA = A.length;
        long[] prefixSumA = new long[lenA];
        prefixSumA[0] = A[0];
        for(int i=1; i<lenA;i++)
        {
            prefixSumA[i] = prefixSumA[i-1]+A[i];
        }
        for(long i:prefixSumA)
        {
            System.out.println("Prefix Sum "+i);
        }
        int lenB = B.length;
        long[] res = new long[lenB];
        for(int i=0;i<lenB;i++)
        {
            int[] tempArr = B[i];
            for(int j:tempArr)
            {
                System.out.println("tem Arr "+j);
            }
            System.out.println("prefixSumA[B[i][1]] "+ prefixSumA[B[i][1]]);
            System.out.println("prefixSumA[B[i][0] "+ prefixSumA[B[i][0]]);
            if(tempArr[0]>0)
            {
                System.out.println("------if------");
                res[i] = prefixSumA[B[i][1]] - prefixSumA[B[i][0]-1];
            }
            else
            {
                System.out.println("------else------");
                res[i] = prefixSumA[B[i][1]] - 0;
            }
            System.out.println("Res " + res[i]);
        }
        return res;
    }
}
