package college_lab;

public class contructor {
	  String name;
	   //Constructor
	  contructor(){
	      this.name = "constructor is called";
	      int length=10;
			int breadth = 10;
			
			int area = length*breadth;
			System.out.println("area of rectangle is"+area);
		
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contructor obj = new contructor();
		   System.out.println(obj.name);

	}

}
