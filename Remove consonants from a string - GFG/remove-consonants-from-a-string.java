//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends




//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
        //code here.
        StringBuilder  t=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                t.append(c);
            }
        }
        if(t.length()==0){
            return "No Vowel";
        }
        return t.toString();
    }
    
}
