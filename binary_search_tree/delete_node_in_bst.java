package binary_search_tree;

public class delete_node_in_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public TreeNode deleteNode(TreeNode root, int key) {
		 
		 if(root==null)
		 {
			 return null;
		 }
		 
		 if(root.val>key)
		 {
			 root.left=deleteNode(root.left,key);
			 
		 }
		 else if(root.val<key)
		 {
			 root.right=deleteNode(root.right,key);
		 }
		 else
		 {
			if(root.left==null)
			{ 
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
		 }
	        
	    }

}
