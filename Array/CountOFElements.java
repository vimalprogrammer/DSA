// Given an array A of N integers. 
// Count the number of elements that have at least 1 elements greater than itself.

// Example Input

// Input 1:
// A = [3, 1, 2]
// Input 2:
// A = [5, 5, 3]

// Example Output
// Output 1:
// 2
// Output 2:
// 1

public class Solution 
{
    // public int solve(int[] A) 
    // {
    //     int max=0;
    //     for(int i: A)
    //     {
    //         max=Math.max(i,max);
    //     }
    //     int count=A.length;
    //     for(int i: A)
    //     {
    //        if(i==max)
    //        {
    //            count--;
    //        }
    //     }
    //     return count;
    // }

    public int solve(int[] A) 
    {
        int max=Integer.MIN_VALUE;
        for(int i : A)
        {
            max = Math.max(i,max);
        }
        int count =0;
        for(int i : A)
        {
            if(i!=max)
                count++;
        }
        return count;
    }
}
