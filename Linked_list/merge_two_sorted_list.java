package Linked_list;

public class merge_two_sorted_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void merge_two_list(Listnode list1,Listnode list2)
	
	{
		ListNode Dummy = new Listnode();
		ListNode temp = dummy;
		while(list1!null&&list2!null)
		{
			if(list1.val<list2.val)
			{
				Dummy.next =list1;
				Dummy = Dummy.next;
				List1 =List1.next
			}

			else
			{
				Dummy.next =list2;
				Dummy = Dummy.next;
				List2 =List2.next
			}
			
		}
		if(List1!=null)
		{
			Dummy.next =list1;
		}
		if(List2!=null)
		{
			Dummy.next =list2;
		}
	}

}
