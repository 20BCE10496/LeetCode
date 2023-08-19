//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends




class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        int n1 = str1.length();
        if(n1 != str2.length()) return false;
        if(n1 < 2) return str1.equals(str2);
        
        String str = str1.substring(2) + str1.substring(0,2);
        String st = str1.substring(n1-2) + str1.substring(0, n1-2);
        if(str.equals(str2) || st.equals(str2)) return true;
        return false;
    }
}