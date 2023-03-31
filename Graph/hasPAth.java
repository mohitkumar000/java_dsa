package Graph;
import java.util.*;
public class hasPAth {
public boolean hasPath(int src,int des, HashSet<Integer>visited)
{
	
	if(src==des)
	{
		return true;
	}
	visited.add(src);
	for(int key:map.get(src).keySet())
	{
		if(!visited.contains(key))
		{
			boolean ans =hasPath(src,des,visited);
			if(ans)
			{
				return true;
			}
		}
	}
	return false;

}
}
