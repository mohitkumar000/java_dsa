
package Assignment_1;
import java.util.*;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  
        int n= sc.nextInt();  
        int even=0;
        int odd=0;
        int even_ans=0;
        int odd_ans=0;
        

        while(n>=0)
        {
          int p=n%10;
          if(n%2==0)
          {
        	  even++;
        	  
        	
        	  
          }
          if(even%2==0)
          {
        	even_ans=p+even_ans;  
          }
          else
          {
        	  odd++;
          }
          
         
          
          if(odd%2!=0||p==1)
          {
        	  odd_ans= p+odd_ans;
          }
          n=n/10;
          
          
         

        }
        System.out.println(even_ans);
        System.out.println(odd_ans);
		
			
			
		
		
		
		
	}
	

}
