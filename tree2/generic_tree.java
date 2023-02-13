package tree2;
import java.util.*;
public class generic_tree {
	
	public static class Node
	{
		int data;
		ArrayList<Node>children = new ArrayList<>();
		
		
		Node(int data)
		{
			this.data=data;
		}
		
		
		
	}
	public static void levelorder(Node root)
	{
		Queue<Node> queue=new Queue<Node>();
		queue.add(root);
		
		while(queue.size()>0)
		{
			Node temp = queue.remove();
			System.out.println(temp.data+ " ");
			
			for(Node child:temp.children)
			{
				queue.add(child);
			}
		}
		System.out.println(".");
		
	}
	
	
	
	public static void main(String[] args) {
		Node root =new Node(10);
		
		Node tenc1 = new Node(20);
		root.children.add(tenc1);
		
		Node tenc2 = new Node(30);
		root.children.add(tenc2);
		
		Node tenc3 = new Node(40);
		root.children.add(tenc3);
		
		
		Node tenc4 = new Node(50);
		root.children.add(tenc4);
		
		
	}

}
