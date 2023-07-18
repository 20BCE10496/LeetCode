//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        long[] dp = new long[n+1];
        dp[0]=1;
        int m= (int)1e9+7;
        
        for(int i=1;i<n+1;i++){
            dp[i]= (dp[i-1]%m+ (i-2>=0 ? dp[i-2] : 0 )%m  + (i-3>=0 ? dp[i-3] : 0 )%m)%m;
            
            
        }
        
        return dp[n];
    }
    
}
