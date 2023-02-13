package college_lab;
import java.util.*;

public class choclate_distrubition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			int m = scn.nextInt();
			list.add(i);
			
		}
		int d = scn.nextInt();
		int m = scn.nextInt();
		int ans = 0;
		
		
		ans = birthday(list,d,m);
		
		System.out.println(ans);
		
		
		

	}
	public static int birthday(List<Integer> s, int d,int m)
	{
		int count =0;
		for(int i =0;i<=s.size()-m;i++)
		{
			int sum =0;
			for(int j=0;j<m;j++)
			{
				sum = sum+s.get(i+j);
			}
			if(sum==d)
			{
				count++;
			}
		}
		return count;
	}

}
