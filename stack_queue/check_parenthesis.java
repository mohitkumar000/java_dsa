package stack_queue;
import java.util.*;

public class check_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "{([])";
		boolean ans =ispar(x);
		System.out.println(ans);

	}
		public static void ispar(String x)

	    {
	        // add your code here
	        int count =0;
	        
	        boolean ans =false;
	        Stack<Character>st = new Stack<>();
	        for(int i=0;i<x.length();i++)
	        {
	        	char ch =x.charAt(i);
	        	if(st.size()==0)
	        	{
	        		ans=false;
	        	}
	        	
	        	else
	        	{
	        		if(ch=='{'||ch=='['||ch=='(')
	        		{
	        			st.push(ch);
	        			
	        		}
	        		else if(ch==')')
	        		{
	        			ans=handle(st,')');
	        			
	        			
	        		}
	        		else if(ch=='}')
	        		{
	        			ans=handle(st,'}');
	        			
	        		}
	        		else if(ch==']')
	        		{
	        			ans=handle(st,']');
	        			
	        		}
	        		
	        			
	        		
	        		
	        	}
	        	
	        	
	           
	           
	        }
	        if(st.size()==0)
	        {
	        	return ans;
	        }
	        else
	        {
	        	return false;
	        }
	        
	       
	       
	            
	       }
	  
	     public static boolean handle(Stack<Character> st,char pass)
	     {
	    	 boolean ans = false;
	    	 if(st.size()==0)
	    	 {
	    		 ans=false;
	    	 }
	    	 else if(st.peek() !=pass) 
	    	 {
	    		 ans=false;
	    		 
	    	 }
	    	 else 
	    	 {
	    		 st.pop();
	    		 ans =true;
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 return ans;
	    	 
	    	 
	    	 
	    	 
	    		 
	     }
	    

}
