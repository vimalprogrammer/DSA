// Problem Description

// You have given a string A having Uppercase English letters.
// You have to find how many times subsequence "AG" is there in the given string.
// NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

// Problem Constraints
// 1 <= length(A) <= 105

// Input Format
// First and only argument is a string A.

// Output Format
// Return an integer denoting the answer.

// Example Input
// Input 1:
//  A = "ABCGAG"

// Input 2:
//  A = "GAB"

// Example Output
// Output 1:
//  3
// Output 2:
//  0

// Example Explanation
// Explanation 1:
//  Subsequence "AG" is 3 times in given string 
// Explanation 2:
//  There is no subsequence "AG" in the given string.


public class SpecialSequence 
{
    // public int solve(String A) 
    // {
    //     long count=0;

    //     long Acount=0;
    //     for(char i:A.toCharArray())
    //     {
    //         if(i=='A')
    //         {
    //             Acount++;
    //         }
    //         if(i=='G')
    //         {
    //             count+=Acount;
    //         }
    //     }
    //     return (int)(count%(Math.pow(10,9)+7));
    // }

    //VS
    public int solve(String s)
    {
        int countA = 0; long countG = 0;
        for(char i : s.toCharArray())
        {
            if(i == 'A')
                countA++;
            if(i == 'G')
                countG += countA;
        }
        return (int)(countG%(Math.pow(10,9)+7));
    }
}
