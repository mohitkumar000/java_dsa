package Graph;
import java.util.*;


public class valid_tree {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean validtree(int n,int[][] edges)
	{
		HashMap<Integer,HashMap<Integer ,Integer>>map= new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(i,new HashMap<>());
			
		}
		for(int i=0;i<edges.length;i++)
		{
			int a1=edges[i][0];
			int b1=edges[i][1];
			map.get(a1).put(b1,2);
			map.get(b1).put(a1,2);
			map.get(b1).put(a1,2);
		}
		
	}
	public boolean IsvalidTree(HashMap<Integer,HashMap<Integer ,Integer>>map) {
		
	}

	
}
