public class Solution 
{
    // public int[] solve(int[] A, int B) 
    // {
    //      B=B%A.length;
    //      if(B==0) return A;
    //      reverse(A,0,A.length-1);
    //      reverse(A,0,B-1);
    //      reverse(A,B,A.length-1);
    //      return A;
    // }
    // public static void reverse(int arr[], int left,int right)
    // {
    //     while(left<right)
    //     {
    //         int temp = arr[left];
    //         arr[left]=arr[right];
    //         arr[right]=temp;
    //         left++;
    //         right--;
    //     }
    // }

    //VS
    public int[] solve(int[] A, int B) 
    {
        int len = A.length;
        B=B%len;
        if(B!=0)
        {
            reverse(A, 0, len-1);
            reverse(A, 0, B-1);
            reverse(A, B, len-1);
        }
        return A;
    }

    public static void reverse(int[] A, int s, int e)
    {
        while(s<e)
        {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;e--;
        }
    }
}
