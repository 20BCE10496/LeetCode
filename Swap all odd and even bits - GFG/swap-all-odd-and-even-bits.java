//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	     for (int i = 0; i < 32; i += 2) {
            int i_bit = (n >> i) & 1; 
            int i_1_bit = (n >> (i + 1)) & 1;
            n = n - (i_bit << i) - (i_1_bit << (i + 1)) + (i_bit << (i + 1)) + (i_1_bit << i); 
        }
        return n;
	}
}

//{ Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}
// } Driver Code Ends