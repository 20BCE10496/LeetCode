//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     public long findMinDiff (ArrayList<Integer> a, int n, int m)
//     {
//         // your code here
//         if(m>n){
//             return -1;
//         }
//         Integer[] arr=new Integer[n];
//         arr=a.toArray(arr);
//         Arrays.sort(arr);
//         int start=0;
//         int end=m-1;
//         int minDifference=Integer.MAX_VALUE;
        
//         while(end<n){
//             int difference=arr[end]-arr[start];
            
//             if(difference<minDifference){
//                 minDifference=difference;
//             }
//             start++;
//             end++;
//         }
//         return minDifference;
//     }
// }


class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        if (m > n) {
            return -1;
        }

        Collections.sort(a); // Sort the ArrayList in ascending order

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int difference = a.get(i + m - 1) - a.get(i);
            
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        return minDifference;
    }
}
