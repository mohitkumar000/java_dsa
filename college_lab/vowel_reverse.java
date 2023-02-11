package college_lab;
import java.util.*;
public class vowel_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		System.out.println(reverseVowels(str));
		

	}
	public static String reverseVowels(String s) {
        String ans= "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                st.push(ch);
            }
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                st.push(ch);
            }
        }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ans+=st.pop();
            }
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                ans+=st.pop();
            }
            else{
                ans+=ch;
            }
        }
        return ans;
    }

}
