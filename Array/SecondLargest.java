public class Solution {
    // public int solve(int[] A) 
    // {
    //     if(A.length<2) return -1;
    //     int firstLarge=-1;
    //     int secondLarge=-1;
    //     for(int i:A)
    //     {
    //         if(i>=firstLarge)
    //         {
    //             if(i>firstLarge)
    //             {
    //                 secondLarge = firstLarge;
    //                 firstLarge=i;
    //             }
    //         }
    //         else if(i>secondLarge)
    //         {
    //             secondLarge = i;
    //         }
    //     }
    //     return secondLarge;
    // }

    //VS
    public static int solve(int[] A) 
    {
        int firstHigh = -1, secondHigh = -1;
        if(A.length<2) return -1;
        for(int i: A)
        {
            if(i>firstHigh)
            {
                secondHigh = firstHigh;
                firstHigh = i;
            }
            else if(i>secondHigh)
            {
                if(firstHigh!=i)
                    secondHigh = i;
            }
        }
        return secondHigh;
    }
}
