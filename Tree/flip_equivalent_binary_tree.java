package Tree;

public class flip_equivalent_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	public static boolean has_path_sum(TreeNode root,int targetSum)
	{
		
		if(root==null)
		{
			return false;
			
		}
		if(root.left==null&&root.right==null)
		{
			 return targetSum-root.val==0;
		}
		return has_path_sum(root.left,targetSum-root.val)||has_path_sum(root.right,targetSum-root.val);
	}

}
