package arrays;
import java.util.*;
public class buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		int lsf =Integer.MAX_VALUE;
		int op =0;
		int pist =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<lsf)
			{
				
				lsf =arr[i];
			}
			pist =arr[i]-lsf;
			if(pist>op)
			{
				op =pist;
			}
		}
		System.out.println(op);

	}

}
