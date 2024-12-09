// Problem Description

// Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

// Example Input
// Input 1:
// A = [2, 1, 6, 4]

// Input 2:
// A = [1, 1, 1]

// Example Output
// Output 1:
// 1

// Output 2:
// 3

// Example Explanation
// Explanation 1:
// Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1]. 
// Therefore, the required output is 1.

// Explanation 2:
// Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1] 
// Therefore, the required output is 3.

public class SpecialIndex {
    
    public static void main(String[] args)
    {
        int[] A = {1, 2,3,7,1,2,3};
        int res = solve(A);
        System.out.println("Count = "+res);
    }

    public static int solve(int[] A)
    {
        int lenA = A.length;
        int[] oddPrefixSum = new int[lenA];
        int[] evenPrefixSum = new int[lenA];
        int odd=0, even=0;
        for(int i=0;i<lenA;i++)
        {
            if(i%2==1)
                odd+=A[i];
            else
                even+=A[i];

            oddPrefixSum[i]=odd;
            evenPrefixSum[i]=even;
        }
        
        for(int i:oddPrefixSum)
            System.out.println("oddPrefixSum "+i);
        for(int i:evenPrefixSum)
            System.out.println("evenPrefixSum "+i);

        int cnt=0;
        for(int i=0;i<lenA;i++)
        {
            long evenSum = 0,oddSum = 0;
            if(i==0)
            {
                oddSum = evenPrefixSum[lenA-1]-evenPrefixSum[i];
                evenSum = oddPrefixSum[lenA-1]-oddPrefixSum[i];
                if(evenSum == oddSum)
                    cnt++;
                System.out.println("evenPrefixSum[lenA-1]+evenPrefixSum[i] "+ evenPrefixSum[lenA-1]+evenPrefixSum[i]);
                System.out.println("oddPrefixSum[lenA-1]+oddPrefixSum[i] "+ oddPrefixSum[lenA-1]+oddPrefixSum[i]);
            }
            else
            {
                evenSum = evenPrefixSum[i-1] + (oddPrefixSum[lenA-1] - oddPrefixSum[i]);
                oddSum = oddPrefixSum[i-1] + (evenPrefixSum[lenA-1] - evenPrefixSum[i]);
                if(evenSum == oddSum)
                    cnt++;
                System.out.println("evenPrefixSum[i-1] + oddPrefixSum[lenA-1] - oddPrefixSum[i] "+evenPrefixSum[i-1] + (oddPrefixSum[lenA-1] - oddPrefixSum[i]));
                System.out.println("oddPrefixSum[i-1] + evenPrefixSum[lenA-1] - evenPrefixSum[i] "+oddPrefixSum[i-1] + (evenPrefixSum[lenA-1] - evenPrefixSum[i]));
            }
        }
        return cnt;
    }
}

