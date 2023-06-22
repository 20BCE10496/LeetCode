//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        int n=s.length(),c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    n=Math.min(n,j);
                    c++;
                    break;
                }
            }
        }
        return c==0?"-1":String.valueOf(s.charAt(n));
    }
} 