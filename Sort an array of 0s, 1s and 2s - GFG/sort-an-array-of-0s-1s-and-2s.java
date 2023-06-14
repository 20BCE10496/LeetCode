//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int array[], int n)
    {
        // code here 
        int countzero=0;
        int countone=0;
        int counttwo=0;
        
        int i=0;
        while(i<n){
            if(array[i]==0){
                countzero=countzero+1;
            }
            if(array[i]==1){
                countone=countone+1;
            }
            if(array[i]==2){
                counttwo=counttwo+1;
            }
            
            i=i+1;
        }
        i=0;
        while(i<countzero){
            array[i]=0;
            i=i+1;
        }
        while(i<countone+countzero){
            array[i]=1;
            i=i+1;
        }
        while(i<countzero+counttwo+countone){
            array[i]=2;
            i=i+1;
        }
       
    }
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a no.");
        n=s.nextInt();
        int[]array=new int[100];
        System.out.println ( " Enter elements of the array :  " ) ;  
        for ( int i = 0 ; i < n ; i++ )  {
            array[ i ] = s.nextInt() ;  
        }
        sort012( array , n ) ;  
        System.out.println ( " Array after sorting : " ) ;  
        for ( int i = 0 ; i < n ; i++ )  {
            System.out.println ( array[ i ] ) ;
        }
     
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends