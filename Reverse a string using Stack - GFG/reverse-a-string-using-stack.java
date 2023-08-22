//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        //code here
        char c[]=S.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            
            left++;
            right--;
        }
        return new String(c);
        
    }

}