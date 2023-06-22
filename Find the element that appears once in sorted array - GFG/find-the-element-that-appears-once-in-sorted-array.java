//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends

class Solution
{
    int findOnce(int arr[], int n)
{
    int low = 0;
    int high = n - 1;

    while (low < high)
    {
        int mid = (low + high) / 2;

        if (mid % 2 == 0 && arr[mid] == arr[mid + 1])
        {
            low = mid + 2;
        }
        else if (mid % 2 == 1 && arr[mid] == arr[mid - 1])
        {
            low = mid + 1;
        }
        else
        {
            high = mid;
        }
    }

    return arr[low];
}


}