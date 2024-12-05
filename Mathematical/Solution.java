public class Solution {
    // public int solve(int A) {
    // if(A<2)
    //     return 0;
    //     for(int i=2;i<=Math.sqrt(A);i++)
    //       {  if(A%i==0)
    //            return 0;
    //       }
    //       return 1;
    // }

    public int solve(int A)
    {
        if(A <= 1)
            return 0;
        if(A<=3)
            return 1;
        if(A%2 == 0 || A%3 == 0)
            return 0;        	
        for(int i=5;i*i<=A;i+=6)
        {
            // Why Check 𝑛 % ( 𝑖 + 2 ) = = 0?
            // We are checking if a number 𝑛 n is divisible by potential factors. 
            // After 2 and 3, prime numbers have a special pattern: they are either 6 𝑘 − 1 or 6 𝑘 + 1 (e.g., 5, 7, 11, 13, ...).
            // 1. 𝑖 checks numbers of the form 6 𝑘 − 1(like 5, 11, 17...). 
            // 2. 𝑖+2 checks numbers of the form 6 𝑘 + 1(like 7, 13, 19...). 
            // By doing both checks, we only test numbers that could actually be prime.
            if(A%i == 0 || A%(i+2)==0)
                return 0;
        }
        return 1;
    }
}
