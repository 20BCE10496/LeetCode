//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int next=n;
        int sum = 0;
        String yes = "Yes";
        String no = "No";
        while(next>0){
            int rem = next % 10;
            sum += rem*rem*rem;
            next = next/10;
        }
        if(n == sum){
            return yes;
        }else{
            return no;
        }
    }
}