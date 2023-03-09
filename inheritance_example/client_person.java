package inheritance_example;

public class client_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee ca = new employee();
		double person = ca.annual_salary;
		
		ca.setName("abcd");
		 System.out.println(ca.getName());
		
		System.out.println(person);
	}

}
