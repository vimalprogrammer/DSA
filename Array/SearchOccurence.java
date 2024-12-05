Given an array A and an integer B, find the number of occurrences of B in A.

Example Input
Input 1:
 A = [1, 2, 2], B = 2 
Input 2:
 A = [1, 2, 1], B = 3 

Example Output
Output 1:
 2
Output 2:
 0

public class Solution {
    // public int solve(int[] A, int B) 
    // {
    //     int count=0;
    //     int left=0,right=A.length-1;
    //     while(left<=right)
    //     {
    //         if(A[left]==B)
    //         {
    //             count++;
    //         }
    //         if(left !=right && A[right]==B)
    //         {
    //             count++;
    //         }
    //         right--;
    //         left++;
    //     }
    //     return count;
    // }

    public int solve(int[] A, int B) 
    {
        int l = 0;
        int r = A.length-1;

        int count = 0;
        while(l<=r)
        {
            if(A[l] == B)
                count++;
            if(A[l]!=A[r] && A[r] == B)
                count++;
            l++;r--;
        }
        return count;
    }
}
