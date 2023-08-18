//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends



class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        HashMap<Character,Character> mp=new HashMap<Character,Character>();
        HashMap<Character,Character> mp2=new HashMap<Character,Character>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            char ch1=str2.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch)!=ch1)
                return false;
            }
            else{
                mp.put(ch,ch1);
            }
            if(mp2.containsKey(ch1)){
                if(mp2.get(ch1)!=ch)
                return false;
            }
            else{
                mp2.put(ch1,ch);
            }
        }
        return true;
        
    }
}