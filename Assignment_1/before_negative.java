package Assignment_1;
import java.util.*;

public class before_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num=scn.nextInt();
			if(num>=0)
			{
				System.out.println(num);
			}
			else {
				break;
			}
		}
		 

	}

}
