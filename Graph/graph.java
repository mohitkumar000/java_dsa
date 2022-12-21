package Graph;
import java.util.*;

public class graph {

	HashMap<Integer ,HashMap<Integer,Integer>>map;
	
	public graph(int v)
	{
		map =new HashMap<>();
		for(int i=1;i<=v;i++)
		{
			map.put(i,new HashMap<>());
		}
	}
	public void AddEdge(int v1,int v2,int cost)
	{
		map.get(v1).put(v2,cost);
		map.get(v2).put(v2,cost);
		
	}
	public boolean ContainsEdge(int v1,int v2)
	{
		return map.get(v1).containsKey(v2);
	}
	

}
