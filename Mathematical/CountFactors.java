public class Solution {
    // public int solve(int A) {
    //    int count =0;
    //    double q=Math.sqrt(A);
    //    for(int i=1;i<=q;i++)
    //     {
    //         if(A%i==0)
    //          {   if(A/i==i)
    //                 count++;
    //             else
    //             count+=2;
    //          }
    //     }
    //     return count;
    // }

    //VS
    public int solve(int A)
    {
        int cnt = 0;
        for(int i=1; i*i<=A; i++)
        {
            if(A%i == 0)
            {
                if(A/i == i)
                    cnt+=1;
                else
                    cnt+=2;
            }
        }
        return cnt;
    }
}
