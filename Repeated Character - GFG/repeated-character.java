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
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            char res = ob.firstRep(s);
            if (res == '#')
                System.out.println(-1);
            else
                System.out.println(res);
             
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution
{
    char firstRep(String S)
    {
       StringBuilder s=new StringBuilder("");
       
       for(int i=0;i<S.length()-1;i++){
           for(int j=i+1;j<S.length();j++){
               if(S.charAt(i)==S.charAt(j)){
                   s.append(S.charAt(i));
                return s.charAt(0);}
            
           }
     
           
       }
      return '#';  
   }
}