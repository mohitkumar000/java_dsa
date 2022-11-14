package leetcode;

public class reverse_words_in_a_srting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is this ";
		//String [] ans =reverse(str);
		
		//for(int i=0;i<ans.length;i++)
		//{
			//System.out.println(ans[i
			                    ]);
		//}
				

	}
	public static void reverse(String str) 
	{
		String [] input = str.split(" ");
		
		for(int i=input.length-1;i>=0;i++)
		{
			System.out.println(input[i]);
		}
		
		
		
		
		
	}


}
