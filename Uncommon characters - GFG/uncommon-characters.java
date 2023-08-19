//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends




//User function Template for Java

class Solution
{
    String UncommonChars(String str1, String str2)
    {
        // code here
        String s="-1";
        if(str1.equals(str2) && str1.length()==str2.length())
          return s;
        Set<Character> set1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : str2.toCharArray()) {
            set2.add(c);
        } // Find the intersection of the sets
        if(set1.equals(set2))
           return "-1";
        char b[]=new char[set1.size()+set2.size()];
        int count=0;
        for (char c : set1) {
            if (!set2.contains(c)) {
                b[count++]=c; 
            }
        }
        for (char c : set2) {
            if (!set1.contains(c)) {
                b[count++]=c;
            }
        }
        Arrays.sort(b);
        s="";
        for(char c:b)
          {
             s=s+c;
          }
        if(s=="")
          return "-1";
        return s;
    }
}