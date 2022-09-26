package assignment_2;
import java.util.*;
public class lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		char ch =scn.next().charAt(0);
		int i =(int)(ch);
		if(i>=97&&i<=122)
		{
			System.out.println("lowercse");
		}
		else if(i>=65&&i<=90)
		{
			System.out.println("uppercase");
		}
		else
		{
			System.out.println("invalidA");
		}
		

	}

}
