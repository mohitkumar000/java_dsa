package Tree;
import java.util.*;

import binary_search_tree.bst.Node;

public class Level_order_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void LevelOrder()
	{
		Queue<Node>q=new LinkedList<>();
		List<Node>ll=new ArrayList<>();
		
		q.add(root);
		while(!q.isEmpty())
		{
			Node nn = q.remove();
			System.out.println(nn.data+" ");
			if(nn.left!=null)
			{
				q.add(nn.left);
			}
			if(nn.right!=null)
			{
				q.add(nn.right);
			}
		}
		System.out.println();
		
	}
}
