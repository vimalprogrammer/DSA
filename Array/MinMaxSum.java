public class Solution {
    // public int solve(int[] A) 
    // {
    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;
    //     for(int i : A)
    //     {
    //         min=Math.min(i,min);
    //         max=Math.max(i,max);
    //     }
    //     return min+max;
    // }

    //VS
    public int solve(int[] A) 
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : A)
        {
            max = maxi(max, i);
            min = mini(min, i);
        }
        return min+max;
    }
    static int maxi(int a, int b)
    {
        if(a<b)
            return b;
        return a;
    }

    static int mini(int a, int b)
    {
        if(a>b)
            return b;
        return a;
    }
}
