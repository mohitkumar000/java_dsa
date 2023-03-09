package _2d_array;

public class spiral_martix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static void spiral(int [] [] arr)
	{
		int minr = 0;
		int maxr  =arr.length-1;
		int minc= 0;
		int maxc = arr[0].length-1;
		
		for(int i = minc;i<=maxc;i++)
		{
			System.out.println(arr[minr][i]);
		}
		minr++;
		for(int i = minr ;i<=maxr;i++)
		{
			System.out.println(arr[i][maxc]+ " ");
		}
		maxc--;
		
	}

}
