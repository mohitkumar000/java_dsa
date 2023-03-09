package binary_search_tree;

public class bst {
	
	public class Node{
		int val;
		Node left;
		Node right;
	}
	private Node root;
	
	public bst(int [] in)
	{
		root =createTree(in,0,in.length-1);
	}
	

	private Node createTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		
		if(si>ei)
		{
			return null;
		}
		
		int mid = (si+ei)/2;
		Node nn = new Node();
		nn.val=in[mid];
		nn.left= createTree(in,si,mid);
		nn.right= createTree(in,mid+1,ei );
		
		return nn;
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
