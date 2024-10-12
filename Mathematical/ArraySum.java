import java.util.*;

public class ArraySum
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter the no of digits: ");
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+"th element: ");
            arr[i] = sc.nextInt();
        }
        int result = sumArr(arr, n);
		System.out.println("Result "+ result);
	}

    public static int sumArr(int[] arr, int n)
    {
        int arrSum = 0;
        while(n>0)
        {
            arrSum += arr[n-1];
            n--;
        }
        return arrSum;
    }
}