package Linked_list;

public class Linked_list_cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean hasCycle(ListNode head) {
	        
		 Listnode slow = head;
	    	Listnode fast=head;
	    	while(fast!=null&&fast.next!=null)
	    	{
	    		slow =slow.next;
	    		fast=fast.next.next;
	    		if(slow==fast)
	    		{
	    			return true
	    		}
	    	}
	    	return false;
	        
	        
	        
	    }
	}

}
