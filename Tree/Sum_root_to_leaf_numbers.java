package Tree;

public class Sum_root_to_leaf_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if()

	}
	public int sum(Treenode node,int sum)
	{
		if(node.left==null&&node.right==null)
		{
			return sum*10+node.val;
		}
		int l=sum=(node.left,sum+node.val);
		int r=sum=(node.left,sum+node.val);
	}

}
