import java.util.*;

public class LinearSearch
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter the no of digits: ");
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the digits: ");
		for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the digit to be searched: ");
        int x = sc.nextInt();
        int result = linearSearch(arr, n, x);
		System.out.println("Position of digit "+ result);
	}

    public static int linearSearch(int[] arr, int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}