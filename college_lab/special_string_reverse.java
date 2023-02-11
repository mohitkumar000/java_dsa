package college_lab;
import java.util.*;


public class special_string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ab-cd";
		System.out.println(reverseOnlyLetters( str));
		

	}
	public static  String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);
        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }
        return ans.toString(); 
    }
	

}
