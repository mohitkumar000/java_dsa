package binary_search_tree;

public class insert_into_bst {
	
	  
	  public class TreeNode {
	      int val;
	     TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	  }
	  class Solution {
		    public TreeNode insertIntoBST(TreeNode root, int val) {
		    	
		    	if(root==null)
		    	{
		     		return new TreeNode(val);
		    	}
		    	
		    	if(root.val>val)
		    	{
		    		root.left=insertIntoBST(root.left,val);
		    	}
		    	else
		    	{
		    		root.right=insertIntoBST(root.right,val);
		    	}
		    	
		        
		    }
		}
	  
	  
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
