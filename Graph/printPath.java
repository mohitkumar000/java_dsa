package Graph;
import java.util.*;
public class printPath {
public void printPath(int src,int des, HashSet<Integer>visited,string ans)
{
	
	if(src==des)
	{
		System.out.println(ans);
		return;
		
	}
	visited.add(src);
	for(int key:map.get(src).keySet())
	{
		if(!visited.contains(key))
		{
			boolean ans =printPath(key,des,visited,ans+src);
			
		}
	}
	visited.remove(src);

}
}
package Graph;
import java.util.*;
public class printPath {
public void printPath(int src,int des, HashSet<Integer>visited,string ans)
{
	
	if(src==des)
	{
		System.out.println(ans);
		return;
		
	}
	visited.add(src);
	for(int key:map.get(src).keySet())
	{
		if(!visited.contains(key))
		{
			boolean ans =printPath(key,des,visited,ans+src);
			
		}
	}
	visited.remove(src);

}
}

