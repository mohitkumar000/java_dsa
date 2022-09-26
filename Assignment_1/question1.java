
package Assignment_1;
import java.util.*;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num=1;
		int star=1;
		int space =3;
		
		for(int i=0;i<star;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(star + "\t");
				star++;
			}
			
			
			System.out.println();
			
			
		}
		

	}

}
