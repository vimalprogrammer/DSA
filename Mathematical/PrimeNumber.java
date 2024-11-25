    // Count the number of factors of a number
    //Example 1:
    //Input: n = 24
    //Output: 8 24->1,2,3,4,6,8,12,24 

    import java.util.*;

    public class PrimeNumber {
        
        public static void main (String[] args) {
            System.out.print("Enter the digit: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean isPrimeNumber = primeNumber(n);
            if(isPrimeNumber)
                System.out.println(n + " is a primeNumber");    
            else
                System.out.println(n + " is not a primeNumber");    
        }
            
        //O(n) Solution    
        // public static boolean primeNumber(int n)
        // {
        //     int cnt = 0;
        //     for(int i=1;i<=n;i++)
        //     {
        //         if(n%i == 0)
        //             cnt++;
        //     }
        //     if(cnt == 2)
        //         return true;
        //     return false;
        // }
        
        //O(root(n)) Solution
        public static boolean primeNumber(int n)
        {
            int cnt=0;
            for(int i=1; i*i<n; i++) //i*i<n is equivalent to i<sqrt(n), since same factors are repeated after sqrt(n)
            {
                if(n%i == 0)
                {
                    if(n/i == i) //while n/i = i, we have only one factor(36->6*6)
                        cnt++;
                    else
                        cnt+=2;
                }
            }
            if(cnt == 2)
                return true;
            return false;
        }
    }
    
    