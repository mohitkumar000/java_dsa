package Tree;

public class symmetri_tree_leetcode {
	
	 
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
	 

	class solution{
		public boolean isSymmetric(TreeNode root)
		{
			return isMirror(root,root); 
		}

		private boolean isMirror(TreeNode root1, TreeNode root2) {
			// TODO Auto-generated method stub
			if(root1==null&&root2==null)
			{
				return true;
			}
			
			if(root1==null||root2==null)
			{
				return false;
			}
			if(root1.val!=root2.val)
			{
				return false;
			}
			boolean fs = isMirror(root1.left,root2.right);
			boolean ss = isMirror(root1.right,root2.left);
			
			return fs&&ss;
			
		}	
	}

}
