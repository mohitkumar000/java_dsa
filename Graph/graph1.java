package Graph;

import java.util.*;

public class graph1 {
	
	static class Edge{
		int v1;//edge1
		int v2;//edge2
		int wt;//weight
		
		Edge(int v1,int v2,int wt)
		{
			this.v1=v1;
			this.v2=v2;
			this.wt=wt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Edge>[] graph = new ArrayList[7];
		for(int i=0;i<graph.length;i++)
		{
			 graph[i]=new ArrayList<>();
		}
		//0
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,3,40));
		//1
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,2,10));
		//2
		graph[2].add(new Edge(2,1,10));
		graph[2].add(new Edge(2,3,10));
		//3
		graph[3].add(new Edge(3,2,10));
		graph[3].add(new Edge(3,0,40));
		graph[3].add(new Edge(3,4,2));
		//4
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,3));
		graph[4].add(new Edge(4,6,8));
		//5
		graph[5].add(new Edge(5,4,3));
		graph[5].add(new Edge(5,6,3));
		//6
		graph[6].add(new Edge(6,5,3));
		graph[6].add(new Edge(6,4,8));
		

	}

}
