//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
       HashMap<String,Integer>h = new HashMap<String,Integer>();
       for(String x:arr){
           h.put(x,h.getOrDefault(x,0)+1);
       }
       String r1=findMax(h);
       h.remove(r1);
       String r2=findMax(h);
       return r2;
    }
    public static String findMax(HashMap<String,Integer> h){
        int max=0;
        String ans = "";
        for(Map.Entry<String,Integer> e:h.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}