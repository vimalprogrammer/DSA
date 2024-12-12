// Problem Description

// You are given an array A of N integers.
// Return a 2D array consisting of all the subarrays of the array
// Note : The order of the subarrays in the resulting 2D array does not matter.

// Problem Constraints
// 1 <= N <= 100
// 1 <= A[i] <= 105

// Input Format
// First argument A is an array of integers.

// Output Format
// Return a 2D array of integers in any order.

// Example Input
// Input 1:
// A = [1, 2, 3]

// Input 2:
// A = [5, 2, 1, 4]

// Example Output
// Output 1:
// [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

// Output 2:
// [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]

// Example Explanation
// For Input 1:
// All the subarrays of the array are returned. There are a total of 6 subarrays.
// For Input 2:
// All the subarrays of the array are returned. There are a total of 10 subarrays.

public class GenerateAllSubArr
{
	public static void main(String[] args) {
	    int A[]= {1, 3, 2};
        int n=A.length;
        int ans[][]=solve(A);
	    for(int i=0;i<ans.length;i++)
	    {
	        for(int j=0; j<ans[i].length;j++)
	        {
	            System.out.println(ans[i][j]);
	        }
	    }
	}
	
    public static int[][] solve(int[] A) 
    {
        int n=A.length;
        int subArrSize = n*(n+1)/2;
        int[][] res = new int[subArrSize][];
        int indexI = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                res[indexI]=new int[(j-i+1)];//Each row is simply a reference to a 1D array.
                int indexJ = 0;
                for(int k=i;k<=j;k++)
                    res[indexI][indexJ++]=A[k];
                indexI++;
            }
        }
        return res;
    }
}
