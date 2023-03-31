package Graph;
import java.util.*;

public class bfs {

	public void bfs(int src,int des)
	{
		Queue<Integer>q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		q.add(src);
		
		while(!q.isEmpty())
		{
			int rv = q.remove();
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
					q.add(nbr);
				}
			}
			
		}
		return false;
	}
}
