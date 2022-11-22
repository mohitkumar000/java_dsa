package Linked_list;

public class Intersection_point_of_two_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void get_intersection(Listnode headA, Listnode headB)
	{
		Listnode a =headA;
		Listnode b =headB;
		while(a!=b)
		{
			if(a==null)
			{
				a=headB;
			}
			else
			{
				a=a.next;
				
			}
			
			if(b==null)
			{
				b=headA;
			}
			else
			{
				b=b.next;
				
			}
			
			
		}
		return a;
		
		
	}

}
