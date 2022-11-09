package backtracking;

public class queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void print_answer(boolean [] board,int tq,int qpsf,String ans)
	{
		if(tq==qpsf)
		{
			System.out.println(ans);
			return;
		}
		for(int i =0;i<board.length;i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				print_answer(board,tq,qpsf+1,ans+"b",+i+"q"+"qpsf");
				
			}
		}
	}

}
