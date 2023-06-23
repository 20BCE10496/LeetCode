//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> e=new HashMap<>();
        e.put('I',1);
        e.put('V',5);
        e.put('X',10);
        e.put('L',50);
        e.put('C',100);
        e.put('D',500);
        e.put('M',1000);
        
        int res=0;
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && e.get(str.charAt(i)) > e.get(str.charAt(i - 1))) {
                res += e.get(str.charAt(i)) - 2 * e.get(str.charAt(i - 1));
            } else {
                res += e.get(str.charAt(i));
            }
        }
        return res;
    }
}