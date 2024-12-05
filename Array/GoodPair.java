// Q1. Good Pair

// Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

// Input 1:

// A = [1,2,3,4]
// B = 7

// Input 2:
// A = [1,2,4]
// B = 4

// Input 3:
// A = [1,2,2]
// B = 4


// Example Output

// Output 1:
// 1

// Output 2:
// 0

// Output 3:
// 1


// Example Explanation

// Explanation 1:
//  (i,j) = (3,4)

// Explanation 2:
// No pair has sum equal to 4.

// Explanation 3:
//  (i,j) = (2,3)

import java.util.HashMap;

public class GoodPair {
    // public int solve(int[] A, int B) 
    // {
    //    ArrayList<Integer> arr=new ArrayList<>();
    //    for(int i:A)
    //    {
    //        int num=B-i;
    //        if(arr.contains(num))
    //        {
    //             return 1;
    //        }
    //        arr.add(i);
    //    }
    //    return 0;
    // }

    //VS BruteForce
    // public static int solve(int[] A, int n)
    // {
    //     int size = A.length;
    //     for(int i=0;i<size;i++)
    //     {
    //         for(int j=0;j<size;j++)
    //         {
    //             int sum = A[i]+A[j];
    //             if(i!=j && A[i]+A[j]==n)
    //                 return 1;
    //         }
    //     }
    //     return 0;
    // }


    //Efficient Solution
    public static int solve(int[] A, int n)
    {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            map.put(A[i],i);
        }

        for(int i=0; i<A.length;i++)
        {
            if(map.containsKey(n-A[i]) && map.get(n-A[i])!=i)
                return 1;
        }
        return 0;
    }

}