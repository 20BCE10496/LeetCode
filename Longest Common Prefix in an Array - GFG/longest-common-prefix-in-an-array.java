//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        Arrays.sort(arr);
        StringBuilder s=new StringBuilder();
        char s1[]=arr[0].toCharArray();
        char s2[] =arr[n-1].toCharArray();
        int i=0;
        while(i<s1.length){
            if(s1[i]==s2[i]){
                s.append(s1[i]);
                i++;
            }
            else{
                break;
            }
        }
        return i==0?"-1" : s.substring(0,i).toString();
      
    }
}




