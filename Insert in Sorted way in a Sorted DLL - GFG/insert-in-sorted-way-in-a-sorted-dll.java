//{ Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next, prev;
    
    Node(int item)
    {
        data = item;
        next = prev = null;
    }
}

class Insert_Sorted_DLL
{
    public static boolean isChecked(Node head)
    {
        int lengthF=0;
        int lengthB=0;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            lengthF++;
        }
        
        while(temp.prev!=null)
        {
            temp=temp.prev;
            lengthB++;
        }
        
        return lengthF==lengthB? true:false;
    }
	
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        Node head=null, tail=null;
	        
	        for (int i = 0;i < n;i++)
	        {
	            int a = sc.nextInt();
	            if (head==null) 
	            {
	                head = new Node(a);
	                tail = head;
	            }
	            else
	            {
	                tail.next=new Node(a);
	                tail.next.prev=tail;
	                tail = tail.next;
	            }
	        }
	        
	        int x = sc.nextInt();
	        GfG gfg = new GfG();
	         head =  gfg.sortedInsert(head, x);
	         
	        if(isChecked(head))
	        printList(head);
	        else
	        System.out.print("The node has not been inserted correctly. Please fix the prev and next pointers");
	        System.out.println();
	    }
	}
	
	public static void printList(Node head)
	{
	    Node temp = head;
	    while(temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	}
}

// } Driver Code Ends


/*class of the node of the DLL is as
class Node {
	int data;
    Node prev, next;
    Node(int item)
    {data = item;
        next = prev = null;
    }
}
*/
// function should insert a new node in sorted way in
// a sorted doubly linked list
class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        // add your code here
        Node temp=new Node(x);
        if(temp.data<head.data){
            temp.next=head;
            if(head!=null){
                head.prev=temp;
            }
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<temp.data){
                curr=curr.next;
        }
        if(curr.next==null){
               temp.prev=curr;
               curr.next=temp;
               return head;
           }
            Node temp1=curr.next;
            temp1.prev = temp;
            curr.next=temp;
            temp.next=temp1;
            temp.prev=curr;
 
    
        return head;
            
    }
}

