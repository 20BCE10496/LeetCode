//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    static int findSingle(int N, int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int person = arr[i];
            counts.put(person, counts.getOrDefault(person, 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            int person = arr[i];
            if (counts.get(person) == 1) {
                return person;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] party = {1, 2, 3, 2, 1};
        int singlePerson = findSingle(5, party);
        if (singlePerson != -1) {
            System.out.println("The single person is: " + singlePerson);
        } else {
            System.out.println("No single person found in the party.");
        }
    }
}
