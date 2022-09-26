package recursion;

import java.util.ArrayList;
import java.util.List;

public class Letter_combination_of_a_phone_number {
	//static int count =0;

	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="23";
		List<String>list= new ArrayList<>();
		combination(str,"",list);
		//System.out.println();
		//System.out.println(count);
		
		
		
		

	}
	public static void combination(String ques,String ans,List<String>list)
	{
		if(ques.length()==0)
		{
			//System.out.print(ans+" ");
			//count++;
			list.add(ans);
			return;
		}
		char ch =ques.charAt(0); 
		String press =key[ch-'0'];
		for(int i =0;i<press.length();i++)
		{
			combination(ques.substring(1),ans+press.charAt(i),list);
			
		}
	}

}
