package String_builder;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append('b');
		sb.append("hello");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb.reverse());
		System.out.println(sb);
		String s ="helloBye";
		StringBuilder sb1 =new StringBuilder(s);
		
		
		
		
		

	}

}
