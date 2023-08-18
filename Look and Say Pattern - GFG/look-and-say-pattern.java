//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            
            

            Solution ob = new Solution();
            
            System.out.println(ob.lookandsay(n));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String lookandsay(int n) {
        //your code here
        StringBuilder s=new StringBuilder("1");
        for(int i=1;i<n;i++){
            StringBuilder next=new StringBuilder();
            int count=1;
            
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }else{
                    next.append(count).append(s.charAt(j-1));
                    count=1;
                }
            }
            next.append(count).append(s.charAt(s.length()-1));
            s=next;
        }
        return s.toString();
    }
}




