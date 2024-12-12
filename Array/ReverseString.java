public class ReverseString {
    // public int[] solve(int[] A, int B, int C) 
    // {
    //     reverse(A,B,C);
    //     return A;
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
    public int[] solve(int[] A, int s, int e)
    {
        reverse(A, s, e);
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
