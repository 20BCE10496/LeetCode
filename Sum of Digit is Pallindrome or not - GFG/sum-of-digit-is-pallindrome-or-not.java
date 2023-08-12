//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    public static Boolean isPelindrome(int a){
        int temp=a;
        int reverse=0;
        while(temp>0){
            int digit=temp%10;
            reverse = reverse*10 + digit;
            temp =temp/10;
            
        }
        if(a==reverse){
            return true;
        }else{
            return false;
        }
    }
    int isDigitSumPalindrome(int N) {
        // code here
        int digitsum=0;
        while(N>0){
            digitsum=digitsum+(N%10);
            N=N/10;
        }
        if(isPelindrome(digitsum)){
            return 1;
        }else{
            return 0;
        }
    }
}