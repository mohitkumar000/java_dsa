package Tree;
import java.util.*;
public class binary_tree {

	private class Node{
		int data;
		Node left;
		Node right;
		
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	Node n =new Node();
	
	public binary_tree()
	{
		this.root=Createtree();
	}

	private Node Createtree() {
		// TODO Auto-generated method stub
		int item= sc.nextInt();
		Node n = new Node();
		n.data =item;
		boolean hlc = sc.nextBoolean();
		if(hlc==true)
		{
			n.left = Createtree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc==true)
		{
			n.right = Createtree();
		}
		return n;
		
	}
	public void display(Node nn)
	{
		if(nn==null)
		{
			return;
		}
		String s = "";
		s="<--"+nn.data+"-->";
		if(nn.left!=null)
		{
			s=n.left.data+s;
			
		}
		else
		{
			s="."+s;
		}
		if(nn.right!=null)
		{
			s=s+n.right.data;
			
		}
		else
		{
			s=s+".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
		
				
	}
	

}
