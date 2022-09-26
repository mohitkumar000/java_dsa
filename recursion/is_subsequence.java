package recursion;
import java.util.*;

public class is_subsequence {
	static int count =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner(System.in);
		      String str = scn.nextLine();
		printanswer(str, "");
		System.out.println(count);
		

	}
	public static void printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		char ch = ques.charAt(0);
		printanswer(ques.substring(1), ans);
		printanswer(ques.substring(1), ans + ch);

	}

}
