package Graph;
import java.util.*;

public class dfs {

	public void dfs(int src,int des)
	{
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		
		s.push(src);
		
		while(!s.isEmpty())
		{
			int rv = s.pop();
			//1-remove
			//ignore if visited
			if(visited.contains(rv))
			{
				continue;
			}
			// 3 visited
			visited.add(rv);
			if(rv==des)
			{
				return true;
			}
			//univsited neighbour ko add kkarna
			
			if(int nbr:map.get(rv).keySet)
			{
				if(!visited.contains(nbr))
				{
					s.push(nbr);
				}
			}
			
		}
		return false;
	}
}
