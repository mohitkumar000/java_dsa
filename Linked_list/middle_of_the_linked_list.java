package Linked_list;

public class middle_of_the_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public ListNode middleNode(ListNode head) {
	    	Listnode slow = head;
	    	Listnode fast=head;
	    	while(fast!=null&&fast.next!=null)
	    	{
	    		slow =slow.next;
	    		fast=fast.next.next;
	    		
	    	}
	    	return slow;
	        
	        
	        
	        
	    }
	}

}
